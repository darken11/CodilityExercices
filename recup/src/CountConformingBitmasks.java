public class CountConformingBitmasks {

    public int solution(int A, int B, int C) {
        int countConformingBitmasks=0;
        int zeros=0;
        boolean findOne=false;
        while(A!=0 && B!= 0 && C!=0){
            if(A%2==1 && B%2==1 && C%2==1){
                findOne=true;
                if(zeros>countConformingBitmasks){
                    countConformingBitmasks=zeros;
                }
                zeros=0;
            }else{
                if(findOne){
                    zeros++;
                }
            }
            A=A/2;
            B=B/2;
            C=C/2;
        }
        return countConformingBitmasks*2;
    }



}
