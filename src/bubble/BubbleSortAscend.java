package bubble;

// Bubble Sort Method for Ascending Order

public class BubbleSortAscend {
    public static void bubbleSortAscendingOrder(int[] array) {
        int j;
        boolean swapped = true;
        int temp;

        while (swapped) {
            swapped = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}