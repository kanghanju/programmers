package level0;

public class DivisionOfTwoNumbers {
	public int solution(int num1,int num2) {
		int answer = (int)(num1/(double)num2*1000); //형변환
		return answer;
	}
}
