package selection;

// Selection Sort Method for Ascending Order

public class SelectionSortAscending {
    public static void selSortAscending(int[] array) {
        int i;
        int j;
        int min;
        int min_i;
        int temp;

        for (i = 0; i < array.length; i++) {
            min = array[i];
            min_i = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }
    }
}