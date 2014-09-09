/**
 *What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2520; //known minimum for numbers 1 to 10
        int quotient = 0;
        int result = 0;

        //Divide y by x. If the remainder is zero, increment x(the divisor) and divide again. Else increment y(the dividend) and reset x(the divisor) back to 1
        do {
            quotient=y/x;
            if(y%x==0) {
                x++;
            }
            else {
                y++;
                x=1;
            }
        }while(x<=20);

        result = y;
        System.out.println(result);
    }
}