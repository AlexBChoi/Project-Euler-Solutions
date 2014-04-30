/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {
    public static void main(String[] args) {
        final int MAX_VALUE = 4000000;
        sumOfEvenFibonacci(MAX_VALUE);
    }

    public static void sumOfEvenFibonacci(int iMAX_VALUE) {
        int i = 1;
        int j = 1;
        int result = 0;
        int summation = 0;

        //Fibonacci Sequence Loop
        while(result<iMAX_VALUE) {
            result = i + j;
            i = j;
            j = result;

            //Adds the even fibonacci numbers
            if(result%2==0) {
                summation += result;
            }
        }

        System.out.println(summation);
    }
}