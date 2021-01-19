import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {


        TripletsCounter tripletsCounter = new TripletsCounter();

        List<Long> myList = new ArrayList<Long>();


        myList.add(0, 1L);
        myList.add(1, 5L);
        myList.add(2, 5L);
        myList.add(3, 25L);
        myList.add(4, 125L);
        //myList.add(5, 25L);


        List<Long> myList1 = new ArrayList<Long>();
        for (int i = 0; i < 101 ; i++) {
            myList1.add(i,1L);
        }

        tripletsCounter.countTriplets(myList1,1);
        tripletsCounter.countTriplets(myList, 5);

    }
/*
        HashMap <Integer, Long> map = new HashMap<>();

        long acumulator = 0;

        for (int i = 0; i < myList.size() ; i++) {
            map.put(i, myList.get(i));
        }

        List z = map.values().stream()
                .filter(k -> k % 5 == 0)
                .collect(Collectors.toList());

        for (Object l: z) {
            System.out.println("number " +l);
        }
    }
*/


}
