package euler;

public class P5 {
	// Main code
	public static void main(String[] args) {
		long gcd = 1;
		long lcm = 11;
		
		for(long i = 12; i < 20; i++) {
			long num1 = lcm;
			long num2 = i;
						
			gcd = gcdSet(num1, num2);
			
			lcm = (num1 * num2) / gcd;
		}
		
		System.out.println(lcm);
	}
	
	private static long gcdSet(long a, long b) {
		long gcd = 1;
		for(long i = 1; i < Math.min(a, b); i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	
	/*
	// SCRAP CODE
	public static void main(String[] args) {
		long[] list = LongStream.rangeClosed(11,20).toArray();
		long product = productSet(list);
		long gcd = gcdSet(11, list);
		
		System.out.println((product) / (gcd));
	}

	private static long productSet(long[] list) {
		long prod = 1;
		for(long i : list) {
			prod *= i;
		}
		return prod;
	}

	private static long gcdSet(long a, long b) {
		long gcd = 1;
		for(long i = 1; i < Math.max(a, b); i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	private static long gcdSet(long a, long[] b) {
		long gcd = 1;
		for(long i = 0; i < b.length; i++) {
			gcd = gcdSet(gcd, b[(int) i]);
		}
		return gcd;
	}
	*/
}
