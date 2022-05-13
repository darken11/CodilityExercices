public class MaxCounters {

    public int[] solution(int N, int[] A) {

        int maxCounters = 0;
        int lstResetCounter = 0;
        int[] counters = new int[N];
        if (A.length == 0) {
            System.out.println("A must contain at least One element");
        }
        for (int j : A) {

            if (j == N + 1) {
                lstResetCounter = maxCounters;
            } else {
                int X = j - 1;
                if (counters[X] < lstResetCounter) {
                    counters[X] = lstResetCounter + 1;
                } else {
                    counters[X]++;
                }
                if (counters[X] > maxCounters) {
                    maxCounters = counters[X];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (counters[i] < lstResetCounter) {
                counters[i] = lstResetCounter;
            }
        }


        return counters;

    }

}
