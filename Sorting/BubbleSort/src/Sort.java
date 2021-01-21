import java.sql.SQLOutput;

public class Sort {


    static void countSwaps(int[] a) {

        int numberSwaps = 0;

        for (int i = 0; i < a.length -1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[j + 1]) {
                    int first = a[j];
                    int second = a[j+ 1];

                    a[j] = second;
                    a[j+1] = first;
                    numberSwaps++;
                }
            }

        }
        System.out.println("Array is sorted in " + numberSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }

}
