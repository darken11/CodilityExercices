import java.util.*;


public class MissingInteger {
    public int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;
        // Starting from 1 (min), compare all elements, if it does not match
        // that would the missing number.
        for (int i : A) {
            if (i == min) {
                min++;
            }
        }
        return min;
    }
}
