package day0518;



public class Switch3 {

	public static void main(String[] args) {
		
		//현재 시각에 따라 스케줄을 표시
		// 8~12시 사이에 출근
		// 출근 시간 랜덤 설정
		// 8시 : 출근
		// 9시 : 회의
		// 10시 : 외근
		// 나머지 시간 : 업무
		
		int time = (int)(Math.random() * 5) + 8;
		
		System.out.println("현재 시간 : " + time);
		
		switch(time) {
		case 8:
			System.out.println("출근을 합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("외근을 나갑니다.");
			break;
		default:
			System.out.println("업무를 합니다.");
		}
		
	}
	
}
