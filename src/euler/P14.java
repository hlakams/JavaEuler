package euler;

public class P14 {
    public static void main(String[] args){

        // Vars for Collatz assessment
        int[] max = {0, 0};
        int count = 0;
        long current = 1;

        // Collatz algorithm
        // Note: must use Long or JVM will crash at number 113383! (int memory size error)
        for(int n = 1; n < 1000000; n++){
            count = 0;
            current = n;

            while(current != 1){
                count++;
                if(current % 2 == 0){
                    current /= 2;
                }
                else{
                    current = current * 3 + 1;
                }
            }

            if(count > max[0]){
                max[0] = count;
                max[1] = n;
            }
        }

        // Maximum Collatz number < million
        System.out.println(max[1]);
    }
}
