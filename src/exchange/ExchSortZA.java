package exchange;

// Exchange Sort Method for Ascending Order (String)

public class ExchSortZA {
    public static void sortStringExchangeDescending(String[] array) {
        int i;
        int j;
        String temp;

        for (i = 0; i < array.length - 1; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) < 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}