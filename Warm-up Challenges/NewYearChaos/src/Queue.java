public class Queue {


    public void minimumBribes(int[] q) {

        int totalBribes = 0;

        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (int i = 0; i < q.length; ++i) {
            if (q[i] == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q[i] == expectedSecond) {
                ++totalBribes;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q[i] == expectedThird) {
                totalBribes += 2;
                ++expectedThird;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }

        System.out.println(totalBribes);
    }
}