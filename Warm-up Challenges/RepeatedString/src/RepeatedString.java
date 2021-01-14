import java.util.ArrayList;

public class RepeatedString {


    public long repeatedString(String s, long n) {

        int givenStringLength = s.length();
        int numberOfA = 0;
        long numberOfOccurencies = 0;
        String[] strings = s.split("");
        long howManyTimes;
        long resultDivide = n%givenStringLength;

        if(resultDivide == 0) {
           howManyTimes = n/givenStringLength;
        } else {
            howManyTimes = n/givenStringLength;
        }

        for (String letterA: strings) {
            if(letterA.equals("a")) {
                numberOfA++;
            }
        }

        if(resultDivide == 0) {
            numberOfOccurencies = howManyTimes * numberOfA;
            System.out.println(numberOfOccurencies);
        } else {
            numberOfOccurencies = howManyTimes * numberOfA;
            long lettersLeft = n - howManyTimes * s.length();

            for (int i = 0; i < lettersLeft; i++) {
                if(strings[i].equals("a")) {
                    numberOfOccurencies++;
                    System.out.println(numberOfOccurencies);
                }
            }
        }

        return numberOfOccurencies;

    }

}
