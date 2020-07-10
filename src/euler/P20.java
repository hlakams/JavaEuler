package euler;

import javafx.util.converter.BigIntegerStringConverter;

import java.math.BigInteger;

public class P20 {

    public static void main(String[] args){

        // Setting up BigIntegers for factorial, int for size
        BigInteger num = new BigInteger("100");
        BigInteger expanded = new BigInteger("100");
        int size = 0;

        // Factorial loop
        for(int i = 100; i > 0; i--){
            num = num.multiply(expanded);
            expanded = expanded.subtract(new BigInteger("1"));
        }

        // BigInteger isn't easy to parse values, so string -> chat int values is easier
        String set = num.toString();

        // Loop for char -> int values sum
        for(int i = 0; i < set.length(); i++){
            size += Integer.parseInt(String.valueOf(set.charAt(i)));
        }

        // Sum of digits in 100!
        System.out.println(size);
    }
}
