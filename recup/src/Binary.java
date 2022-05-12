public class Binary {

    public int solution(int N) {
        int maxLengthBinaryGap=0;
        int zeros=0;
        boolean findOne=false;
        while(N!=0){
            if(N%2==1){
                findOne=true;
                if(zeros>maxLengthBinaryGap){
                    maxLengthBinaryGap=zeros;
                }
                zeros=0;
            }else{
                if(findOne){
                    zeros++;
                }
            }
            N=N/2;
        }
        return maxLengthBinaryGap;
    }


}
