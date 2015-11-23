import bubbleSort.AlphabeticBubbleSortAscending;
import bubbleSort.AlphabeticBubbleSortDescending;
import bubbleSort.BubbleSortAscending;
import bubbleSort.BubbleSortDescending;
import exchangeSort.ExchangeSortAscend;
import exchangeSort.ExchangeSortDescend;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Несортированный массив: " + '\n' + Arrays.toString(MyArray.X));

        Arrays.sort(MyArray.X);
        System.out.println('\n' + "Сортировка массива при помощи метода sort(): " + '\n' + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Пузырьком по возрастанию:");
        BubbleSortAscending.bubbleSortAscendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Пузырьком по убыванию:");
        BubbleSortDescending.bubbleSortDescendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Обменом по возрастанию:");
        ExchangeSortAscend.exchangeSortAscendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Обменом по убыванию:");
        ExchangeSortDescend.exchangeSortDescendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Несортированный массив: " + Arrays.toString(MyArray.Z));

        AlphabeticBubbleSortAscending.sortStringBubbleAscending(MyArray.Z);
        System.out.println('\n' + "Сортировка массива Пузырьком по возрастанию: ");
        PrintArray.printArrayZ();
        System.out.println("или: " + Arrays.toString(MyArray.Z));

        AlphabeticBubbleSortDescending.sortStringBubbleDescending(MyArray.Z);
        System.out.println('\n' + "Сортировка массива Пузырьком по убыванию: ");
        PrintArray.printArrayZ();
        System.out.println("или: " + Arrays.toString(MyArray.Z));


    }
}

/**
 * В примере использован рефакторинг IntelliJ IDEA:
 * методы bubbleSortAscendingOrder() и bubbleSortDescendingOrder() вынесены из класса Main во внешние классы (Refactor => Move ... или нажатие F6)
 * методы for (int i : X) вынесены в отдельный метод printArrayX() (Refactor => Extract => Method ... или нажатие Ctrl+Alt+M) и перемещен во внешний класс PrintArray (Refactor => Move ... или нажатие F6)
 * массив int[] X = new int[]{3, 9, 1, 6, 2, 7, 4, 5, 8} вынесен  из класса Main в отдельный класс MyArray (Refactor => Extract => Constant ... или нажатие Ctrl+Alt+C)
 */