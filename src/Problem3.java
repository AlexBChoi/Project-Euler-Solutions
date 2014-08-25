import java.util.ArrayList;

/**
 * What is the largest prime factor of the number 600851475143?
 */
public class Problem3 {
    public static void main(String[] args) {
        final long VALUE = 600851475143L;
        long x = 13195;
        largestPrimeFactor(x);
    }

    public static void largestPrimeFactor(long iVALUE) {
        ArrayList factors = new ArrayList();
        long result = 1L;

        //Finds prime factors, not prime number list
        for(long i=2L; i<Math.sqrt(iVALUE); i++) { //largest prime factor is less than square root of value
           if(iVALUE%i==0) { //if there is no remainder it is a factor? divide value by each number and if remainder is zero multiply it
               System.out.println("This is a prime number:" + i);
               if(result!=iVALUE) { //while result does not equal the value keep multiplying factors
                   System.out.println("This is prime number2:" + i);
                   result *= i;
                   factors.add(i);
               }
           }
        }

        int largestFactor = factors.size()-1; //gets index of last/largest value in array
        System.out.println(factors.get(largestFactor));
    }
}