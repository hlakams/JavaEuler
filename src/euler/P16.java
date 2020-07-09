package euler;

import java.math.BigInteger;

public class P16 {
    public static void main(String[] args){

        // Vars for power digit sum
        int sum = 0;
        BigInteger initial = new BigInteger("2");
        String num = (initial.pow(1000)).toString();

        // Series summation of all digits in expansion of 2 ^ 1000
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        // Sum of digits in 2 ^ 1000
        System.out.println(sum);
    }
}
