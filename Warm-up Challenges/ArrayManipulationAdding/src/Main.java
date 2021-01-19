public class Main {

    public static void main(String[] args) {

        int[][] newArray = new int[4][3];

        newArray[0][0] = 1;
        newArray[0][1] = 4;
        newArray[0][2] = 2;

        newArray[1][0] = 1;
        newArray[1][1] = 4;
        newArray[1][2] = 2;

        newArray[2][0] = 1;
        newArray[2][1] = 4;
        newArray[2][2] = 2;

        newArray[3][0] = 1;
        newArray[3][1] = 4;
        newArray[3][2] = 2;


        Adding adding = new Adding();

        adding.arrayManipulation(10, newArray);



    }
}
