package euler;

import java.util.ArrayList;

public class P02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int minus2 = 1;
		int minus1 = 2;
		int sum = 0;
		int temp = 0;
		int limit = 4000000;
		
		list.add(minus2);
		list.add(minus1);
		
		for(int top = minus1; top < limit/2; top = temp) {
			temp = minus1;
			minus1 = minus1 + minus2;
			minus2 = temp;
			list.add(minus1);
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i)%2 == 0) {
				sum += list.get(i);
			}
			//System.out.println(list.get(i));
		}
		System.out.println(sum);
	}
}
