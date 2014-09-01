/**
 *Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        int factor1 = 999;
        int factor2 = 999;
        findPalindrome(factor1, factor2);
    }

    public static void findPalindrome(int iFactor1, int iFactor2) {
        int forward = 0;
        int reverse = 0;
        int largestPalindrome = 0;

        //Calculate all products from 999 down to 100
        for(int i=iFactor1; i>=100; i--) {
            for(int j=iFactor2; j>=100; j--) {
                forward = i*j;
                reverse = reverseInteger(forward);

                //Store largest palindrome found
                if(forward==reverse) {
                    if(reverse>largestPalindrome) {
                        largestPalindrome = reverse;
                    }
                }
            }
        }
        //Nested for loop: Multiplies initial value of factor1 by factor2.
        //Factor2 decrements to minimum value while factor1 remains at initial value
        //Factor2 resets to initial value while factor1 is decremented by one
        //Factor2 decrements to minimum value until and repeats above step until factor1 reaches minimum value

        System.out.println(largestPalindrome);
    }

    //Reverses and returns given integer
    public static int reverseInteger(int iInteger) {
        int integer = iInteger;
        int reverse = 0;
        int remainder = 0;

        do {
            remainder = integer%10; //store last digit from integer
            reverse = reverse*10+remainder; //increase digit of stored number & adds last digit
            integer = integer/10; //removes last digit from integer
        }while(integer>0);

        return reverse;
    }
}