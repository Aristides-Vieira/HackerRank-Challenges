import java.util.HashMap;

public class Adding {


    public long arrayManipulation(int n, int[][] queries) {

        int numberToAdd;
        int leftPointer;
        int rightPointer;

        long[] addingArray = new long[n + 2];


        for (int i = 0; i < queries.length; i++) {
            leftPointer = queries[i][0] - 1;
            rightPointer = queries[i][1] - 1;
            numberToAdd = queries[i][2];

            addingArray[leftPointer] += numberToAdd;
            addingArray[rightPointer + 1] -= numberToAdd;;
        }



        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < addingArray.length; i++) {
            sum += addingArray[i];
            max = Math.max(max,sum);
        }
        return max;
    }
}
















       /* int numberToAdd;
        int leftPointer;
        int rightPointer;

        long MVP = 0L;

        long[] addingArray = new long[n];

        for (int i = 0; i < queries.length; i++) {
            leftPointer = queries[i][0] - 1;
            rightPointer = queries[i][1] - 1;
            numberToAdd = queries[i][2];

            for (int j = 0; j < n ; j++) {
                if(j >= leftPointer && j <= rightPointer) {
                    addingArray[j] += numberToAdd;
                    if(addingArray[j] > MVP) {
                        MVP = addingArray[j];
                    }
                }
            }
        }

        System.out.println(MVP);
        return MVP;

    }
}
*/