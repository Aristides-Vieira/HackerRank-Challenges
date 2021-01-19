import javax.sound.sampled.EnumControl;
import java.util.*;

public class TripletsCounter {


    public long countTriplets(List<Long> arr, long r) {

        long counter = 0;
        HashMap<Long, Long> leftMap = new HashMap<>();
        HashMap<Long, Long> rightMap = new HashMap<>();

        for (Long number : arr) {
            rightMap.put(number, rightMap.getOrDefault(number, 0L) +1);
        }

        for (int i = 0; i < arr.size(); i++) {
            long middleValue = arr.get(i);
            long leftMapValue = 0;
            long rightMapValue = 0;

            rightMap.put(middleValue, rightMap.getOrDefault(middleValue, 0L) -1);

            if(leftMap.containsKey(middleValue / r) && (middleValue % r == 0)) {
                leftMapValue = leftMap.get(middleValue / r);
            }

            if(rightMap.containsKey(middleValue * r))
                rightMapValue = rightMap.get(middleValue * r);


            counter += leftMapValue * rightMapValue;

            leftMap.put(middleValue, leftMap.getOrDefault(middleValue, 0L) +1);
        }
        System.out.println(counter);
        return counter;
    }

}
/*
        long counter = 0;

        long number;
        long expectedFirst;
        long expectedSecond;

        int testedIndexOne = 0;
        int testedIndexTwo = 0;


        for (int i = 0; i < arr.size(); i++) {
            number = arr.get(i);
            expectedFirst = number * r;
            expectedSecond = expectedFirst * r;

            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j) == expectedFirst) {
                    testedIndexOne++;
                }
                if(arr.get(j) == expectedSecond) {
                    testedIndexTwo++;
                }


            }

            if(testedIndexTwo > 0) {
               counter = counter + (long) testedIndexOne * testedIndexTwo;
            }

            testedIndexOne = 0;
            testedIndexTwo = 0;
        }

        System.out.println(counter);
        return counter;
    }


}
*/