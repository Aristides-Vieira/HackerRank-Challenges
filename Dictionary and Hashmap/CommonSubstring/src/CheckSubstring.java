import java.util.HashMap;

public class CheckSubstring {



    public String twoStrings(String s1, String s2) {

        char[] s1CharArr = s1.toCharArray();
        char[] s2CharArr = s2.toCharArray();
        HashMap<Character, Integer> s1Map = new HashMap<>();

        for (char s1Char: s1CharArr) {
            s1Map.put(s1Char, 0);
        }

        for (char s2Char: s2CharArr) {
            if(s1Map.containsKey(s2Char)) {
                s1Map.replace(s2Char, 1);
            }
        }
        if(s1Map.containsValue(1)){
            return "YES";
        } else {
            return "NO";
        }
    }
}
