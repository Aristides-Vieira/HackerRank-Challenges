public class HourGlassAdder {



    public int hourglassSum(int[][] arr) {

        int result = 0;
        int currentResult = 0;
        int currentNumber = 0;

        int howManyHourGalsses = (arr.length -2) * (arr.length - 2);

        int lastIndexK = 3;
        int lastIndexJ = 3;
        int k = 0;
        int l = 0;
        int repeat = 0;

        while(repeat < howManyHourGalsses) {

            for (int i = k; i < lastIndexK; i++) {
                for (int j = l; j < lastIndexJ; j++) {
                    currentNumber = arr[i][j];
                    currentResult = currentResult + currentNumber;
                    System.out.print(arr[i][j]);

                    if(i == k + 1 && j == l) {
                        currentNumber = arr[i][j];
                        currentResult = currentResult - currentNumber;
                    }
                    if(i == k + 1 && j == l+2) {
                        currentNumber = arr[i][j];
                        currentResult = currentResult - currentNumber;
                    }
                }
                System.out.println("");
                if(repeat == 0) {
                    result = currentResult;
                }
            }
            System.out.println("");
            if(result < currentResult) {
                result = currentResult;
            }
            currentResult = 0;


            lastIndexJ++;
            l++;

            if (lastIndexJ == arr.length +1) {
                lastIndexJ = 3;
                l=0;
                k++;
                lastIndexK++;
            }

            repeat++;
        }
        return result;
    }
}
