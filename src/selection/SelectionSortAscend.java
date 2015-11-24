package selection;

// Selection Sort Method for Ascending Order

public class SelectionSortAscend {
    public static void selectionSortDescendingOrder(int[] array) {
        int temp;

        for (int i = array.length - 1; i > 0; i--) {
            int first = 0;
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[first]) {
                    first = j;
                }
                temp = array[first];
                array[first] = array[i];
                array[i] = temp;
            }
        }
    }
}