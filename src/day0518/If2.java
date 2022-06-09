package day0518;


public class If2 {

	public static void main(String[] args) {
		
		//랜덤으로 주사위를 던져서 결과값 확인
		//만약 주사위의 값이 1이면 
		//'1번 나왔습니다.' 출력
		//if 사용
		
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번 나옴");
			System.out.printf("%d번 나옴", num);
		} else if(num == 2) {
			System.out.println("2번 나옴");
			System.out.printf("%d번 나옴", num);
		} else if(num == 3) {
			System.out.println("3번 나옴");
			System.out.printf("%d번 나옴", num);
		} else if(num == 4) {
			System.out.println("4번 나옴");
			System.out.printf("%d번 나옴", num);
		} else if(num == 5) {
			System.out.println("5번 나옴");
			System.out.printf("%d번 나옴", num);
		} else if(num == 6) {
			System.out.println("6번 나옴");
			System.out.printf("%d번 나옴", num);
		}
		
		
		
	}

}
