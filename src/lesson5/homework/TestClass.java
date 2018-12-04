package lesson5.homework;

public class TestClass {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private float[] arr = new float[size];
    private float[] arr1 = new float[h];
    private float[] arr2 = new float[h];

    public void method1() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        this.arrLoad(arr);

        System.out.print("METHOD 1. Execution time: ");
        System.out.println(System.currentTimeMillis() - a);
    }

    public void method2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread t1 = new Thread(() -> arrLoad(arr1));
        t1.start();
        Thread t2 = new Thread(() -> arrLoad(arr2));
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.print("METHOD 2. Execution time: ");
        System.out.println(System.currentTimeMillis() - a);
    }

    private void arrLoad(float[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
