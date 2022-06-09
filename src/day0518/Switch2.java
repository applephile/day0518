package day0518;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		//성적을 입력받아
		//100~90 A
		//89~80 B
		//79~70 C
		//69~60 D
		//나머지 F

		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		char grade;
		
		switch(score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;
		}
		
		System.out.println(grade + "학점");
		
		scan.close();
	}

}
