
public class Sstudy01 {

	public static void main(String[] args) {

			String[]array = new String[] {"A","B","C","D"};
			
			for(int i = 0; i< array.length; i++){ //인덱스 구하고 범위정해주고 증가값 or 감소값 설정
				if(i%2==0) continue; //세미콜론 기준으로 한줄!!!! 만 인식한다 -> 중괄호를 안썼을 때
					
					System.out.println(array[i]);
			}
			
//			for(String 문자: array) {
//				System.out.println(문자); //순차적으로 값만 불러옴 -> 역순안됨 -> index의 개념을 몰라도 괜찮음
//			}
	}

}
