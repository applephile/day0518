package day0518;

public class For7 {

	public static void main(String[] args) {
		//두 개의 주사위를 던졌을 때
		//주사위의 합이 6이 되는 모든 경우의 수 출력
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i + j == 6) {
					System.out.printf("%d + %d = 6\n", i, j);
				}
			}
		}

	}

}
