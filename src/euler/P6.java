package euler;

import java.util.stream.IntStream;

public class P6 {
	public static void main(String[] args) {
		
		int[] listNatural = IntStream.rangeClosed(1, 100).toArray();
		int sqSumNat = 0;
		int sumNatSquared = 0;
		
		for(int i : listNatural) {
			sqSumNat += i*i;
			sumNatSquared += i;
		}
		
		sumNatSquared = (int) Math.pow(sumNatSquared, 2);
		
		System.out.println(sumNatSquared - sqSumNat);
	}
}
