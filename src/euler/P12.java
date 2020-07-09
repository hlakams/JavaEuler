package euler;

public class P12 {
    public static void main(String[] args){

        // Vars for triangular number assessment
        int count = 0;
        int max = 0;
        int currentTriangular = 0;

        // Process to find if triangular number has > 500 divisors or not
        do{
            max++;
            count = 0;
            currentTriangular += max;
            for(int b = 1; b <= currentTriangular; b++){
                if(currentTriangular % b == 0){
                    count++;
                }
            }
        }while(count < 500);

        // First triangular number with > 500 divisors
        System.out.println(currentTriangular);
    }
}
