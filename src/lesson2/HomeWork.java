package lesson2;

import java.util.Arrays;

public class HomeWork {
    static void sumArrElements(String[][] arr, int exceptedSize) {
        int sum = 0;

        if (!checkArrSize(arr, exceptedSize)) {
            throw new MyArraySizeException("Размер массива должен быть " + exceptedSize + " на " + exceptedSize + "!");
        }

        for (String[] anArr : arr) {
            for (String element : anArr) {
                try {
                    sum += Integer.parseInt(element);
                } catch (NumberFormatException ex) {
                    int indexOfColumn = Arrays.asList(anArr).indexOf(element) + 1;
                    int indexOfRow = Arrays.asList(arr).indexOf(anArr) + 1;

                    throw new MyArrayDataException("Нельзя преобразовать элемент в число: " + element + ". Позиция элемента => [Строка: " + indexOfRow + " Столбец => " + indexOfColumn + "]");
                }
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
    }

    static Boolean checkArrSize(String[][] arr, int exceptedSize) {
        if (arr.length != exceptedSize) return false;

        for (String[] anArr : arr) {
            if (anArr.length != exceptedSize) return false;
        }

        return true;
    }
}
