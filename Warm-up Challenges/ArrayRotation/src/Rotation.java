public class Rotation {



    public int[] rotLeft(int[] a, int d) {

        int firstNumber = a[0];
        int[] newArr = new int[a.length];
        int rotations = 0;

        while(rotations < d) {

            if(rotations ==0) {
                System.arraycopy(a, 1, newArr, 0, a.length - 1);

                newArr[newArr.length - 1] = firstNumber;
                rotations++;

            } else {
                firstNumber = newArr[0];
                int[] newArray =  new int[newArr.length];
                System.arraycopy(newArr, 1, newArray, 0, a.length - 1);

                newArray[newArray.length - 1] = firstNumber;

                newArr = newArray;
                rotations++;
            }
        }

         return newArr;
    }

}
