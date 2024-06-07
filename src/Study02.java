
public class Study02 {

	public static void main(String[] args) {
		int a= 0; //무한 반복을 정지하기 위한 변수 설정
		while(true) {
			System.out.println(a);
			//조건을 이용하여 반복을 정지시킨다 -> 주목적!!!
			System.out.println(a > 9);
			if(a > 9) { //무한 반복을 정지하기 위한 연산자
				break; //원하는 값이 나오면 멈춰!
			}
			a++;			
			
		}
		
	}

}
