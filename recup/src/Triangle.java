import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        int N = A.length;
        if (N < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < N-2; i++) {

                if (((long)A[i] + (long)A[i +1] >A[i + 2]) && ((long)A[i +1] + (long)A[i + 2] > A[i]) && ((long)A[i + 2] + (long)A[i] > A[i+1])){
                    return  1;
                }

        }
        return 0;
    }
}
