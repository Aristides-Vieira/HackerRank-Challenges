public class Main {

    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        arr[0][0] = -1;
        arr[0][1] = -1;
        arr[0][2] = 0;
        arr[0][3] = -9;
        arr[0][4] = -2;
        arr[0][5] = -2;

        arr[1][0] = -2;
        arr[1][1] = -1;
        arr[1][2] = -6;
        arr[1][3] = -8;
        arr[1][4] = -2;
        arr[1][5] = -5;

        arr[2][0] = -1;
        arr[2][1] = -1;
        arr[2][2] = -1;
        arr[2][3] = -2;
        arr[2][4] = -3;
        arr[2][5] = -4;

        arr[3][0] = -1;
        arr[3][1] = -9;
        arr[3][2] = -2;
        arr[3][3] = -4;
        arr[3][4] = -4;
        arr[3][5] = -5;

        arr[4][0] = -7;
        arr[4][1] = -3;
        arr[4][2] = -3;
        arr[4][3] = -2;
        arr[4][4] = -9;
        arr[4][5] = -9;

        arr[5][0] = -1;
        arr[5][1] = -3;
        arr[5][2] = -1;
        arr[5][3] = -2;
        arr[5][4] = -4;
        arr[5][5] = -5;

        HourGlassAdder hourGlassAdder = new HourGlassAdder();

        hourGlassAdder.hourglassSum(arr);
/*
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.println(array[i][j]);
            }
        }
*/
    }

}
