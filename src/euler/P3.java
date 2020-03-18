package euler;

import java.util.ArrayList;

public class P3 {
	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<Long>();
		long num = 600851475143L;
		long i = 2;
		
		for(i = 2; i <= num; i++) {
			if(num % i == 0) {
				list.add(i);
				num = num/i;
				i = 2;
			}
		}
		
		for(i = 0; i < list.size(); i++) {
			System.out.println(list.get((int) i));
		}
	}
}
