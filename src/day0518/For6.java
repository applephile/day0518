package day0518;

public class For6 {

	public static void main(String[] args) {
		
		//1 + (-2) + 3 + (-4) + 5 + (-6)...
		//계속 더해가면
		// 몇까지 더해야 총합 100이상이 되는지 구하시오
		
		int s = 1;
		int num = 0;
		int sum = 0;
		
		for(int i=1; true; i++, s=-s) {
			num = i * s;
			sum += num;
//			s *= -1;
			
			if(sum >= 100) {
				break;
			}
			
		}
		System.out.println(num);
		
		
		
//		int sum = 0;
//		int i = 1;
//
//		for(;;) {
//			if(i % 2 == 1) {
//				sum += i;
//			} else if(i % 2 == 0) {
//				sum -= i;
//			}
//			
//			if(sum >= 100) {
//				break;
//			}
//			
//			i++;
//		}
//		
//		System.out.println(i);

	}

}
