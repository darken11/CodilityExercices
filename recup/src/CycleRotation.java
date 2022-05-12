public class CycleRotation {


    public int[] solution(int[] A, int K) {

        if (A.length == 1) return A;
        int[] result = new int[A.length];

        for (int index = 0; K > index; K--) {
            int j = 0;
            for (int i = 0; i < A.length; i++) {
                if (i == 0) {
                    result[j] = A[A.length - 1];
                } else {
                    result[j] = A[i - 1];
                }
                j++;
            }
            for (int i = 0; i < A.length; i++) {
                A[i] = result[i];
            }
            A = result.clone();
        }

        return result;
    }
}
