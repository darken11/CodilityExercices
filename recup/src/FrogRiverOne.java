import java.util.*;

public class FrogRiverOne {

    public int solution(int X, int[] A) {


        Set<Integer> left = new HashSet<>();
        for (int pos = 1; pos <= X; pos++) {
            left.add(pos);
        }

        for (int i = 0; i < A.length; i++) {
            left.remove(A[i]);
            if (left.isEmpty()) {
                return i;
            }
        }


        return -1;


    }


}
