/**
 *Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    public static void main(String[] args) {
        int sumResult;
        int squareResult;

        sumResult = sumOfSquares();
        squareResult = squareOfSums();
        calculateDifference(sumResult, squareResult);
    }

    public static int sumOfSquares() {
        int square = 0;

        //Iterate square of each number and collect summation
        for(int i=0; i<=100; i++) {
            square += (int)Math.pow(i, 2);
        }

        return square;
    }

    public static int squareOfSums() {
        int sum = 0;

        //Iterate summation of each numbers
        for(int i=0; i<=100; i++) {
            sum += i;
        }

        sum = (int)Math.pow(sum, 2);
        return sum;
    }

    public static void calculateDifference(int iSumResult, int iSquareResult) {
        int result = 0;
        result = iSquareResult-iSumResult;
        System.out.println(result);
    }
}