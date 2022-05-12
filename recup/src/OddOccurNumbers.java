

public class OddOccurNumbers {


    public int solution(int[] A) {
        int i;
        int temp=0;
        for (i = 0; i < A.length; i++) {
            int numberOfOccur = 0;
            for (int k : A)
                if (A[i] == k) {
                    numberOfOccur++;
                }
            if (numberOfOccur % 2 != 0) {
                temp=temp^A[i];
                return temp;
            }

        }
        return -1;
    }


}
