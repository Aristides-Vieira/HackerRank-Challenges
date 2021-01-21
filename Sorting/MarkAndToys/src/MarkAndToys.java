import java.util.Arrays;

public class MarkAndToys {

    public int maximumToys(int[] prices, int k) {

        int[] orderedPrices = Arrays.stream(prices).sorted().toArray();
        int numberOfToys = 0;
        int totalPrice = 0;


        for (int i = 0; i < orderedPrices.length; i++) {
            totalPrice = totalPrice + orderedPrices[i];
            if(totalPrice > k) {
                return numberOfToys;
            }
            numberOfToys++;
        }
        return  numberOfToys;
    }

}
