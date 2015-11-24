package bubble;

// Alphabetic Sorting with Bubble Sort Method for Ascending Order

public class BubbleSortAZ {
    public static void sortStringBubbleAscending(String array[]) {
        int j;
        boolean swapped = true;
        String temp;

        while (swapped) {
            swapped = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}