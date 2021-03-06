import bubble.BubbleSortAZ;
import bubble.BubbleSortZA;
import bubble.BubbleSortAscend;
import bubble.BubbleSortDescend;
import cocktail.CocktailSortAscend;
import exchange.ExchSortAZ;
import exchange.ExchSortAscend;
import exchange.ExchSortDescend;
import exchange.ExchSortZA;
import insertion.InsertionSortAscend;
import insertion.InsertionSortDescend;
import quick.QSortAscend;
import quick.Quicksort;
import selection.*;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

// вывод содержимого на экран

        System.out.println("Несортированный массив: " + '\n' + Arrays.toString(MyArray.X));
        System.out.println("Несортированный массив: " + '\n' + Arrays.toString(MyArray.Q));

        Arrays.sort(MyArray.Q);
        System.out.println('\n' + "Сортировка массива Arrays.sort(): " + '\n' + Arrays.toString(MyArray.Q));

        Arrays.sort(MyArray.X);
        System.out.println('\n' + "Сортировка массива Arrays.sort() по возрастанию: " + '\n' + Arrays.toString(MyArray.X));

        Arrays.sort(MyArray.Y, Collections.reverseOrder());
        System.out.println('\n' + "Сортировка массива Arrays.sort() по убыванию: " + '\n' + Arrays.toString(MyArray.Y));

        System.out.println('\n' + "Сортировка массива Перемешиванием по возрастанию:");
        CocktailSortAscend.cocktailSortAscendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Пузырьком по возрастанию:");
        BubbleSortAscend.bubbleSortAscendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Пузырьком по убыванию:");
        BubbleSortDescend.bubbleSortDescendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Обменом по возрастанию:");
        ExchSortAscend.exchangeSortAscendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Сортировка массива Обменом по убыванию:");
        ExchSortDescend.exchangeSortDescendingOrder(MyArray.X);
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        System.out.println('\n' + "Несортированный массив: " + Arrays.toString(MyArray.Z));

        BubbleSortAZ.sortStringBubbleAscending(MyArray.Z);
        System.out.println('\n' + "Сортировка массива Пузырьком по возрастанию: ");
        PrintArray.printArrayZ();
        System.out.println("или: " + Arrays.toString(MyArray.Z));

        BubbleSortZA.sortStringBubbleDescending(MyArray.Z);
        System.out.println('\n' + "Сортировка массива Пузырьком по убыванию: ");
        PrintArray.printArrayZ();
        System.out.println("или: " + Arrays.toString(MyArray.Z));

        ExchSortAZ.sortStringExchangeAscending(MyArray.Q);
        System.out.println('\n' + "Сортировка массива Обменом по возрастанию: ");
        PrintArray.printArrayQ();
        System.out.println("или: " + Arrays.toString(MyArray.Q));

        ExchSortZA.sortStringExchangeDescending(MyArray.Q);
        System.out.println('\n' + "Сортировка массива Обменом по убыванию: ");
        PrintArray.printArrayQ();
        System.out.println("или: " + Arrays.toString(MyArray.Q));

        SelectionSortAsc.selectionSortAsc(MyArray.X);
        System.out.println('\n' + "Сортировка массива Выбором по возрастанию (v.1): ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        SelectionSortDesc.selectionSortDesc(MyArray.X);
        System.out.println('\n' + "Сортировка массива Выбором по убыванию (v.1): ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        SelectionSortAscending.selSortAscending(MyArray.X);
        System.out.println('\n' + "Сортировка массива Выбором по возрастанию (v.2): ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        SelectionSortDescending.selSortDescending(MyArray.X);
        System.out.println('\n' + "Сортировка массива Выбором по убыванию (v.2): ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        SelectionSortAscend.selectionSortDescendingOrder(MyArray.X);
        System.out.println('\n' + "Сортировка массива Выбором по возрастанию (v.3): ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        SelectionSortDescend.selectionSortDescendingOrder(MyArray.X);
        System.out.println('\n' + "Сортировка массива Выбором по убыванию (v.3): ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        InsertionSortAscend.insertionSortAscendingOrder(MyArray.X);
        System.out.println('\n' + "Сортировка массива Вставками по возрастанию: ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        InsertionSortDescend.insertionSortDescendingOrder(MyArray.X);
        System.out.println('\n' + "Сортировка массива Вставками по убыванию: ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        Quicksort qsort = new Quicksort();
        qsort.sort(MyArray.X);
        System.out.println('\n' + "Быстрая сортировка, сортировка Хоара: ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

        QSortAscend qsortAscend = new QSortAscend();
        qsortAscend.sortA(MyArray.X);
        System.out.println('\n' + "Быстрая сортировка, сортировка Хоара: ");
        PrintArray.printArrayX();
        System.out.println("или: " + Arrays.toString(MyArray.X));

    }
}

/**
 * В примере использован рефакторинг IntelliJ IDEA:
 * методы bubbleSortAscendingOrder() и bubbleSortDescendingOrder() вынесены из класса Main во внешние классы (Refactor => Move ... или нажатие F6)
 * методы for (int i : X) вынесены в отдельный метод printArrayX() (Refactor => Extract => Method ... или нажатие Ctrl+Alt+M) и перемещен во внешний класс PrintArray (Refactor => Move ... или нажатие F6)
 * массив int[] X = new int[]{3, 9, 1, 6, 2, 7, 4, 5, 8} вынесен  из класса Main в отдельный класс MyArray (Refactor => Extract => Constant ... или нажатие Ctrl+Alt+C)
 */