package level0;

public class SharingPizza {
	public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice==0)
            return n/slice;
        else
            return n/slice+1;
    }
}

/*난 왜 이렇게 더럽게 풀었을까? 
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(slice<n)
            if(n%slice ==0)
                return n/slice;
            else
                return (int)(((double)n/slice)+1);
        else
            return 1;
    }
}*/