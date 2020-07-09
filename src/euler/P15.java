package euler;

public class P15 {
    public static void main(String[] args){

        // Number of paths in Grid
        long paths = 1;

        // based on Binomial Coefficient formula from Wikipedia: https://en.wikipedia.org/wiki/Binomial_coefficient
        for(int gridDims = 1; gridDims < 21; gridDims++) {
            paths = 1;
            for (int edge = 0; edge < gridDims; edge++) {
                paths *= (gridDims * 2) - edge;
                paths /= edge + 1;
            }

            // Grid size for square edge sizes 1 - 20
            System.out.println("Paths for grid of size " + gridDims + " is: " + paths);
        }
    }
}
