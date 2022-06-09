package day0518;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		//사원이 실적 목표를 달성하였을 경우
		//실적 목표를 초과한 금액의 10%를
		//성과급으로 받는 프로그램 작성
		//실적 목표는 1000이고 상수로 설정
		
		final int goal = 1000;
		int user;
		int comm = 0;
		
		Scanner scan = new Scanner(System.in);
				
		user = scan.nextInt();
			
		if(user >= goal) {
			comm = (user - goal) / 10;
			System.out.printf("보너스 : %d\n", comm);
			System.out.println(user + comm);
		} else {
			System.out.println(user);
		}
		
		scan.close();
	}

}
