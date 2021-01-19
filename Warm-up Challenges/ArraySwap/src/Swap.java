import java.util.HashMap;

public class Swap {

    public int minimumSwaps(int[] arr) {

        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                int t = i;
                while (arr[t] != i + 1) {
                    t++;
                }
                int temp = arr[t];
                arr[t] = arr[i];
                arr[i] = temp;
                swap++;
            }
        }
        System.out.println(swap);
        return swap;
    }

}

        /*
        int swap = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != i + 1) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k] == i + 1) {
                        arr[k] = arr[i];
                        arr[i] = i + 1;
                        swap++;
                    }
                }
            }
        }
        System.out.println(swap);
        return swap;
    }
}


        /*      int expectedNumber = 0;
        int swapNumber = 0;
        int i = 0;
        int swaps = 0;

        while(i < arr.length) {
           if(arr[i] != i+1) {
               swapNumber = arr[i];
               expectedNumber = i +1;
               for (int j = 0; j < arr.length ; j++) {
                   if(arr[j] == expectedNumber) {
                       arr[i] = expectedNumber;
                       arr[j] = swapNumber;
                       swaps++;
                   }
               }
           }
           i++;
        }
       // System.out.println(swaps);
        return swaps;

    }
}
*/