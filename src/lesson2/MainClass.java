package lesson2;

public class MainClass {
    public static void main(String[] args) {
        String[][] arr = { { "1", "1", "1", "1" }, { "1", "1", "1", "1" }, { "1", "1", "1", "1" }, { "1", "1", "1", "1" } };

        try {
            HomeWork.sumArrElements(arr, 4);
        } catch (MyArraySizeException ex) {
            System.out.println("Ошибка в размере массива: " + ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.println("Ошибка в данных массива: " + ex.getMessage());
        }
    }
}
