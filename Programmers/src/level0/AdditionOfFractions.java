package level0;

public class AdditionOfFractions {
	public int gcd(int a,int b){
        if(a>b){
            while(b!=0){
                int r = a%b;
                a=b;
                b=r; 
            }
            return a;
        }
        else{
            while(a!=0){
                int r=b%a;
                b=a;
                a=r; 
            }
            return b;
        }
    }
    
   
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = numer1*denom2+numer2*denom1;   
        answer[1] = denom1*denom2;
        int r =gcd(answer[0],answer[1]);
        answer[0] = answer[0]/r;
        answer[1] = answer[1]/r;
        
        return answer;
    }
}
