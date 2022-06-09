package day0518;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// 숫자 입력 후 숫자의 각 자릿수 합계 계산
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		
//		while(num != 0) {  
//			sum += num % 10;
//			num /= 10;
//		}
		
		for(; num>0; ) {
			sum += num % 10;
			num /= 10;
			
			System.out.printf("sum : %d, num : %d\n", sum, num);
		}
		
//		for(;;) {
//			sum += num % 10;
//			num /= 10;
//			
//			if(num == 0) {
//				break;
//			}
//		}
		
		System.out.println(sum);
		
		scan.close();
	}

}
