package quick;

public class QSortAscend {
    private int[] array;
    private int indexes;

    public void sortA(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        this.array = array;
        indexes = array.length;
        quicksort(0, indexes - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = array[low + (high - low) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}