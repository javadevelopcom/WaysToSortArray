package selection;

// Selection Sort Method for Descending Order

public class SelectionSortDesc {
    public static void selectionSortDesc(int[] array) {
        int i;
        int j;
        int minIndex;
        int temp;
        int n = array.length;

        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (array[j] > array[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}