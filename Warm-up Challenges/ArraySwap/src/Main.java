public class Main {

    public static void main(String[] args) {

        int[] a =  {7, 1, 3, 2, 4, 5, 6};
        int[] b =  {2,3,4,1,5};

        Swap swap = new Swap();

        swap.minimumSwaps(a);
        swap.minimumSwaps(b);

    }
}
