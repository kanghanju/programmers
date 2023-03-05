package level0;

public class LambSkewers {
	public int solution(int n, int k) {//몇인분을 착각했다
		int result = n*12000+k*2000;

		if(n>=10)
			return result - (2000*(n/10));
		else
			return result;
	}
}
