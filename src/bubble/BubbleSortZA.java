package bubble;

// Alphabetic Sorting with Bubble Sort Method for Descending Order

public class BubbleSortZA {
    public static void sortStringBubbleDescending(String array[]) {
        int j;
        boolean gap = true;
        String temp;

        while (gap) {
            gap = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) < 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    gap = true;
                }
            }
        }
    }
}