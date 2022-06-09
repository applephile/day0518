package day0518;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		//숫자를 입력 받아서 1부터 해당 숫자까지의 
		//짝수합 : 
		//홀수합 :
		//총합계 :
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}
			if(i % 2 == 1) {
				oddSum += i;
			} 
			  
			sum += i;	 
		}
		System.out.printf("짝수 합계 : %,d\n", evenSum);
		System.out.printf("홀수 합계 : %,d\n", oddSum);
		System.out.printf("총합계 : %,d\n", sum);
		
		scan.close();
	}

}
