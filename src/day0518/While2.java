package day0518;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		//1. while, Scanner, if문 이용
		//2. 난수는 1부터 300까지의 숫자
		//3. 숫자 입력 : xxx
		//4. 만약 난수보다 작은 수를 입력하면
		//'난수보다 입력한 값이 작습니다. 큰 수를 입력하세요' 출력
		//5. 난수보다 큰 수를 입력하면
		// '난수보다 입력한 값이 큽니다. 작은 수를 입력하세요' 출력
		//6. 만약 정답이면
		// 정답입니다. X번만에 맞췄습니다.';
		
		Scanner scan = new Scanner(System.in);
		
		int rndNum = (int)(Math.random() * 300 + 1);
		
		int count = 1;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			if(num < rndNum) {
				System.out.println("난수보다 입력한 값이 작습니다. 큰 수를 입력하세요");
			} else if (num > rndNum) {
				System.out.println("난수보다 입력한 값이 큽니다. 작은 수를 입력하세요");
			} else {
				System.out.printf("정답입니다. %d번만에 맞췄습니다.", count);
				break;
			}
			count++;
			
		}
		scan.close();
	}

}
