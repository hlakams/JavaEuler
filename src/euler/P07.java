package euler;

import java.util.ArrayList;

public class P07 {
	public static void main(String[] args){
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(2);
	    list.add(3);
	    list.add(5);
	    list.add(7);
	    list.add(11);

	    int count = 5;
	    int numS = 12;

		while(count != 10001) {
			int countDivisible = 0;
			for(int index = 0; index < list.size()-1; index++){
				if((numS % list.get(index)) == 0){
					countDivisible++;
				}
			}
			if(countDivisible == 0){
				count++;
				list.add(numS);
			}
			numS++;
		}
		
		System.out.println(list.get(10000));
    }
}
