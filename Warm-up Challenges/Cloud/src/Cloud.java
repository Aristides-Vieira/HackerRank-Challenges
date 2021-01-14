public class Cloud {


    public int jumpingOnClouds(int[] c) {

        int numberOfJumps = 0;
        boolean end = false;
        int position = 0;

        while (!end) {
            if (position >= c.length - 2) {
                numberOfJumps++;
                position++;
                end = true;
            } else {
                if (c[position + 2] == 0) {
                    numberOfJumps++;
                    position++;
                    position++;

                } else {
                    numberOfJumps++;
                    position++;
                }
            }


            if (position == c.length - 1) {
                end = true;
            }
        }
        System.out.println(numberOfJumps);
        return numberOfJumps;
    }


}
