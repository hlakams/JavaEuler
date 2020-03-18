package euler;

public class P4 {
	public static void main(String[] args) {
		int maxPalindrome = 0;
		int product = 0;
		int pComps = 0;
		int pEvenOdd = 0;
		
		for(int num1 = 100; num1 < 999; num1++) {
			for(int num2 = 100; num2 < 999; num2++) {
				product = num1 * num2;
				String p = Integer.toString(product);
				pComps = 0;
				
				if(p.length() % 2 == 0) {
					pEvenOdd = 0;
					for(int i = 0; i < p.length()/2; i++) {
						if(p.charAt(i) == p.charAt(p.length()-(i+1))) {
							pComps++;
						}
					}
				}
				
				if(p.length() % 2 != 0) {
					pEvenOdd = 1;
					for(int i = 0; i < p.length() % 2 - 1; i++) {
						if(p.charAt(i) == p.charAt(p.length()-(i+1))) {
							pComps++;
						}
					}
				}
				
				if((pEvenOdd == 0 && pComps == p.length()/2) || (pEvenOdd == 0 && pComps == p.length()/2)) {
					maxPalindrome = Math.max(maxPalindrome, product);
				}
			}
		}
		System.out.println(maxPalindrome);
	}
}
