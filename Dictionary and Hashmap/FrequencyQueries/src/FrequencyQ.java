import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyQ {


    static List<Integer> freqQuery(List<List<Integer>> queries) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashMap<Integer, Integer> freqsMap = new HashMap<>();
        List<Integer> responseList = new ArrayList<>();

        int action = 0;
        int number = 0;

        for (List<Integer> query : queries) {
            action = query.get(0);
            number = query.get(1);

            switch (action) {
                case 1:
                    Integer u = frequencyMap.get(number);
                    frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) +1);
                    int f = frequencyMap.get(number);
                    if(u !=null && u >0) {
                        int o = freqsMap.get(u);
                        freqsMap.replace(u,o,o-1);
                    }
                    freqsMap.put(f, freqsMap.getOrDefault(f,0) +1);
                    break;

                case 2:
                    Integer k = frequencyMap.get(number);
                    if(k != null && k > 0) {
                        frequencyMap.replace(number, k, k-1);
                            Integer l = freqsMap.get(k);
                            Integer m = freqsMap.get(k-1);
                            if (l > 0) {
                                freqsMap.replace(k, l, l - 1);
                                if(m != null) {
                                    freqsMap.replace(k - 1, m, m+1);
                                }
                        }
                    }
                    break;

                case 3:
                    Integer j = freqsMap.get(number);
                    if(j != null && j > 0) {
                        responseList.add(1);
                    } else {
                        responseList.add(0);
                    }
                    break;
            }
        }
        return responseList;
    }
}

//      Integer freq = frequencyMap.get(number);
//                    if(freq == 0) {
//                        frequencyMap.remove(number);
//                    } else if(freq != null){
//                        frequencyMap.replace(number, frequencyMap.getOrDefault(number, 0)-1);
//                    }