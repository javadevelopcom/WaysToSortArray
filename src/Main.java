import BubbleSort.BubbleSortAscending;
import BubbleSort.BubbleSortDescending;

public class Main {

    public static void main(String[] args) {

        System.out.println("Несортированный массив:");
        PrintArray.printArrayX();

        System.out.println('\n' + "Сортировка массива по возрастанию:");
        BubbleSortAscending.BubbleSortAscendingOrder(MyArray.X);
        PrintArray.printArrayX();

        System.out.println('\n' + "Сортировка массива по убыванию:");
        BubbleSortDescending.BubbleSortDescendingOrder(MyArray.X);
        PrintArray.printArrayX();
    }
}

/**
 * В примере использован рефакторинг IntelliJ IDEA:
 * методы BubbleSortAscendingOrder() и BubbleSortDescendingOrder() вынесены из класса Main во внешние классы (Refactor => Move ... или нажатие F6)
 * методы for (int i : X) вынесены в отдельный метод printArrayX() (Refactor => Extract => Method ... или нажатие Ctrl+Alt+M) и перемещен во внешний класс PrintArray (Refactor => Move ... или нажатие F6)
 * массив int[] X = new int[]{3, 9, 1, 6, 2, 7, 4, 5, 8} вынесен  из класса Main в отдельный класс MyArray (Refactor => Extract => Constant ... или нажатие Ctrl+Alt+C)
 */