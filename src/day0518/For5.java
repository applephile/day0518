package day0518;

public class For5 {

	public static void main(String[] args) {
		
		//1+(1+2)+(1+2+3)...(1+2+3+...+10)
		int sum = 0;
		int result = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			result += sum;
		}
		System.out.println(result);
		
//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
	}
	
}
