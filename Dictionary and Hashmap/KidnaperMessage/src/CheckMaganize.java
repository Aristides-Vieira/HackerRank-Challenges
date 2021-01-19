import java.util.Arrays;
import java.util.HashMap;

public class CheckMaganize {


    public void checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> maganizeMap = new HashMap<>();

        for (String magazineWord : magazine) {
            if (maganizeMap.containsKey(magazineWord)) {
                Integer increment = maganizeMap.get(magazineWord);
                maganizeMap.replace(magazineWord, increment + 1);
                System.out.println("Added " + magazineWord);

            } else {
                maganizeMap.put(magazineWord, 1);
                System.out.println("First " + magazineWord);
            }
        }

        for (String noteWord : note) {
            System.out.println("Checking " + noteWord);
            if (maganizeMap.containsKey(noteWord)) {
                Integer value = maganizeMap.get(noteWord);
                if (value != 0) {
                    maganizeMap.replace(noteWord, value - 1);

                } else {
                    System.out.println("No");
                    return;
                }

            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}