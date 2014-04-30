/**
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
    public static void main(String[] args) {
        final int MAX = 1000;
        sumOfMultiples(MAX);
    }

    public static void sumOfMultiples(int iMAX) {
        int result = 0;

        //The OR condition adds the integers that are multiples only once
        for(int i=0; i<iMAX; i++) {
            if(i%3==0 || i%5==0) {
                result += i;
            }
        }

        System.out.println(result);
    }
}