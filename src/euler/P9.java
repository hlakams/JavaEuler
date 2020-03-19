package euler;

public class P9 {
	public static void main(String[] args) {
		for(long a = 1; a < 500; a++) {
			for(long b = 1; b < 500; b++) {
				long prod = a * a + b * b;
				double c = Math.sqrt(prod);
				
				if(c == Math.floor(c)) {
					if(a + b + c == 1000) {
						System.out.println((long)(a * b * c));
						System.exit(0);
					}
				}
			}
		}
	}
}
