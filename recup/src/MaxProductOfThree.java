import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxProductOfThree {
    public int solution(int[] A) {
        int total;
        int totalMax;
        List<Integer> list = new ArrayList<>();
        if (A.length >= 3) {
            if (A.length == 4 || A.length == 5) {
                for (int i = 1; i < A.length-1 ; i++) {


                    total=A[0]*A[1]*A[i+1];
                    list.add(total);
                }
            } else {
                Arrays.sort(A);
                for (int i = 0; i < A.length-2; i++) {
                    total = A[i] * A[i + 1] * A[i + 2];
                    list.add(total);
                }

            }
        }  if (A.length<3) {
            return 0;
        }

            totalMax = Collections.max(list);

        return totalMax;
    }
}
