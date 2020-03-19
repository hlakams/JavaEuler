package euler;

import java.util.ArrayList;

public class P10 {
	public static void main(String[] args){
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(2);
	    list.add(3);
	    list.add(5);
	    list.add(7);

	    int numS = 8;
	    long sum = 17;
	    boolean countDiv = false;
	    int index = 0;
	    
		while(numS < 2000000) {
			countDiv = true;
			for(index = 0; index < list.size(); index++){
				if((numS % list.get(index)) == 0){
					countDiv = false;
					break;
				}
			}
			if(countDiv){
				sum += numS;
				list.add(numS);
			}
			numS++;
		}
		
		System.out.println(sum);
    }
}