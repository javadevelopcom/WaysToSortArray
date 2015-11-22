package BubbleSort;

// Bubble Sort Method for Descending Order

public class BubbleSortDescending {
    public static void bubbleSortDescendingOrder(int[] array) {
        int j;
        boolean checkpoint = true;
        int temp;

        while (checkpoint) {
            checkpoint = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    checkpoint = true;
                }
            }
        }
    }
}
