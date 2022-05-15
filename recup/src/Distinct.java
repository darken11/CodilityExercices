
import java.util.Arrays;


public class Distinct {


    public int solution(int[] A) {
        int nbrDistinct=0;
        if (A.length > 0) {
            nbrDistinct = 1;

            Arrays.sort(A);
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] != A[i + 1]) {
                    nbrDistinct++;
                }
            }



        }
        return nbrDistinct;
    }
    //les deux solutions valable
    // return  (int)Arrays.stream(A).distinct().count();
}
