/*Ask the user to inter anumber (which can be an integer number 
or floating poin number )and displays is corresponding binary value */

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long dec = 0, num = 0, rem = 0;
        
        System.out.print("Enter A Decimal Number: ");
        dec = sc.nextLong();
        // condition
        while(dec > 0){
            rem = dec % 2; // remainder
            num += rem; // loop until 0
            num *= 10; // additional of num
            dec /= 2; // increase by 10 time each time it loop

        }
        // if(num % 100 == 10){
        //     num = num/10;
        System.out.println("Binary Equivalent: " + num);
    }
}
