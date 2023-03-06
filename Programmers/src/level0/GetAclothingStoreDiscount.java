package level0;

public class GetAclothingStoreDiscount {
	/*
	 * 에러 메시지 "incompatible types: possible lossy conversion from double to int"는 double 값을 int로 변환할 때 
	 * 정보 손실이 발생할 수 있다는 경고 메시지입니다. 이 에러는 int와 double 타입 간의 형변환이 가능하지만, double 타입 값은 소수점 이하 자릿수를 가지기 때문에 
	 * int로 변환하는 과정에서 소수점 이하 정보가 손실될 가능성이 있다는 것을 나타냅니다.
	 * */
	//애초에 문제에서 소수점 이하를 버린 정수를 return하라고 했다
	public static int solution(int price) {

		if(price<100000)
			return price;
		else if(price<300000)
			return (int)(price*0.95);
		else if(price<500000)
			return (int)(price*0.9);
		else 
			return (int)(price*0.8);
	}
	public static void main(String[] args) {
		System.out.print(solution(500000));
	}

}
