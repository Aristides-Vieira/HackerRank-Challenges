import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagram {


    public int sherlockAndAnagrams(String s) {

        int anagrams = 0;
        HashMap<String, Integer> subStringsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubString = s.substring(i, j);
                char[] subStringCharArr = currentSubString.toCharArray();
                Arrays.sort(subStringCharArr);
                String sortedString = String.valueOf(subStringCharArr);

                if (!subStringsMap.containsKey(sortedString)) {
                    subStringsMap.put(sortedString, 1);
                } else {
                    Integer incrementValue = subStringsMap.get(sortedString);
                    subStringsMap.replace(sortedString, incrementValue, incrementValue + 1);
                    anagrams = anagrams + incrementValue;
                }
            }
        }
        System.out.println(anagrams);
        return anagrams;
    }
}
