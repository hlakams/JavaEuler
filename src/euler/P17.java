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
                System.out.println("Length: " + len);
                if (len == 4) {
                    sum += 11; // one thousand
                    len = 0;
                    System.out.println("Thousand");
                    break;
                }

                if (len == 3) {
                    System.out.println(temp);
                    // all numbers of length three have "hundred" in name
                    sum += 7;

                    // extracting place value of hundreds, using dictionary defined in len == 1
//                    temp = n / 100;
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

                if (len == 2){
                    System.out.println(temp);
                    if(temp % 10 == 0){
                        if(temp == 10){
                            sum += 3;
                        }
                        if(temp == 40 || temp == 50 || temp == 60 || temp == 80){
                            sum += 5;
                        }
                        if(temp == 20 || temp == 30 || temp == 90){
                            sum += 6;
                        }
                        if(temp == 70){
                            sum += 7;
                        }
                        break;
                    }

                    else {
                        if (temp >= 11 && temp <= 19) {
                            if (temp == 11 || temp == 12) {
                                sum += 6;
                            } else if (temp == 13) {
                                sum += 8;
                            } else {
                                sum += 4;
                                temp %= 10;
                                sum = ones(sum, temp);
                            }
                            break;
                        }
                        else{
                            if(temp % 10 != 0){
                                int subTemp = (temp/10) * 10;
                                if(subTemp == 10){
                                    sum += 3;
                                }
                                if(subTemp == 40 || subTemp == 50 || subTemp == 60 || subTemp == 80){
                                    sum += 5;
                                }
                                if(subTemp == 20 || subTemp == 30 || subTemp == 90){
                                    sum += 6;
                                }
                                if(subTemp == 70){
                                    sum += 7;
                                }
                            }
                        }
                    }

                    temp %= 10;
                }

                if (len == 1) {
                    System.out.println(temp);
                    sum = ones(sum, temp);
                }

                len--;
            }

            System.out.println("\tSum: " + sum + "\tChange: " + (sum - add));
        }
    }

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
