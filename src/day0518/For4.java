package day0518;

public class For4 {

	public static void main(String[] args) {
		
		//1부터 20까지의 정수 중
		//2의 배수가 아니면서 3의 배수가 아닌 수의 총합, 개수 출력
		
		int sum = 0;
		int count = 0;
		
		for(int i=1; i<=20; i++) {
			//if(i % 2 != 0 && i % 3 != 0)
			if(i % 2 != 0) {
				if(i % 3 != 0) {
					sum += i;
					count ++;
				}
			}			
		}
		
		System.out.printf("%d, %d", sum, count);
	}

}
