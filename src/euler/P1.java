package euler;

public class P1 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for(i = 0; i < 10; i++) {
			if(i % 3 == 0 || i % 5 == 0 || (i % 3 == 0 && i % 5 == 0)) {
				sum += i;
			}
		}
		System.out.print(sum);
	}
}
