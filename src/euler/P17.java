package euler;

public class P17 {

    public static void main(String[] args) {

        // Vars for num word size
        int sum = 0;
        int len = 0;
        int temp = 0;
        int add = 0;
        String num = "";

        // Loop thru 1 - 1000 inclusive and add num word size to sum
        for (int n = 1; n <= 1000; n++) {
            add = sum;
            temp = n;
            num = Integer.toString(n);
            System.out.println("Current number: " + num);
            len = num.length();

            while(len != 0) {

                // Value 1000
                if (len == 4) {
                    sum += 11;
                    len = 0;
                    break;
                }

                // Values 100 - 999
                if (len == 3) {
                    // all numbers of length three have "hundred" in name
                    sum += 7;

                    // extracting place value of hundreds, using dictionary defined in len == 1
                    sum = ones(sum, n / 100);

                    // "and" for numbers that are not hundreds only
                    if(n % 100 == 0){
                        break;
                    }
                    else{
                        sum += 3;
                    }

                    temp %= 100;
                }

                // Values 10 - 99
                if (len == 2){

                    // Values *0
                    if(temp % 10 == 0){
                        sum = tens(sum, temp);
                        break;
                    }

                    else {
                        // Values 11 - 19
                        if (temp >= 11 && temp <= 19) {
                            if (temp == 11 || temp == 12) {
                                sum += 6;
                            }
                            else if (temp == 13 || temp == 18) {
                                sum += 8;
                            }
                            else if(temp == 15){
                                sum += 7;
                            }

                            // Values for -teen
                            else {
                                sum += 4;
                                temp %= 10;
                                sum = ones(sum, temp);
                            }
                            break;
                        }
                        else{
                            // All other non-included values not mentioned, 10's
                            if(temp % 10 != 0){
                                sum = tens(sum, (temp/10) * 10);
                            }
                        }
                    }

                    // Get 1's digit
                    temp %= 10;
                }

                // Values 1 - 9
                if (len == 1) {
                    sum = ones(sum, temp);
                }

                // Decrease key length
                len--;
            }

            // Print out sum + index length
            System.out.println("\tSum: " + sum + "\tChange: " + (sum - add));
        }
    }

    // Helper method for Tens
    private static int tens(int sum, int temp) {
        if(temp == 10){
            sum += 3;
        }
        if(temp == 40 || temp == 50 || temp == 60){
            sum += 5;
        }
        if(temp == 20 || temp == 30 || temp == 80 || temp == 90){
            sum += 6;
        }
        if(temp == 70){
            sum += 7;
        }
        return sum;
    }

    // Helper method for Ones
    private static int ones(int sum, int temp) {
        if(temp == 1 || temp == 2 || temp == 6){
            sum += 3;
        }
        if(temp == 4 || temp == 5 || temp == 9){
            sum += 4;
        }
        if(temp == 3 || temp == 7 || temp == 8){
            sum += 5;
        }
        return sum;
    }
}
