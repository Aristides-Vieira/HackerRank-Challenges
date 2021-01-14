public class Valleys {

    public int countingValleys(int steps, String path) {

        String[] pathArr = path.split("");
        int[] positionArr = new int[steps];
        int position = 0;
        int numberValleys = 0;

        for (int i = 0; i < steps ; i++) {
            if (pathArr[i].equals("D")) {
                position--;
            } else if(pathArr[i].equals("U")) {
                position++;
            }
            positionArr[i] = position;
        }

        for (int i = 0; i < steps; i++) {
            if(positionArr[i] == 0 && i != 0) {
                    if(positionArr[i -1] < 0) {
                        numberValleys++;
                    }
            }
        }
        System.out.println(numberValleys);

        for (int s:positionArr) {
            System.out.println(s);
        }

        return numberValleys;
    }

}
