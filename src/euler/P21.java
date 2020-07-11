package euler;

import java.util.ArrayList;

public class P21 {

    public static void main(String[] args){

        // Vars for sum of amicable numbers + set of possible amicable numbers < 10000
        int sum = 0;
        ArrayList<Integer> set = new ArrayList<Integer>();

        // Populate set with proper values
        for(int i = 2; i < 10000; i++){
            set.add(i);
        }

        // Comparison loop and amicable qualifier
        for(int x = 2; x < set.size(); x++){
            int sub = set.get(x);
            int temp1 = 0;
            int temp2 = 0;

            // Get d(a) = b
            for (int y = 1; y < (sub - 1); y++) {
                if (sub % y == 0) {
                    temp1 += y;
                }
            }

            // Get d(b) = c
            for(int z = 1; z < (temp1 - 1); z++){
                if(temp1 % z == 0){
                    temp2 += z;
                }
            }

            // Check if d(d(a)) = c (where c = d(a))
            if(sub == temp2 && sub != temp1){
                sum += sub;
                set.remove((Integer) sub);
            }
        }

        // Print out sum of amicable numbers < 10000
        System.out.println(sum);
    }
}
