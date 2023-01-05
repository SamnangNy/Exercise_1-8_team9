/*Ask the user to inter a binary number (which can be an integer number 
  or ploating point number )and display its corresponding decimal value */

import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        num = input.nextInt();

        int dec_value = 0;

        // Initializing base value to 1, i.e 2^0
        int base = 1;
        int temp = num;
        // condiction
        while ( temp > 0 ) {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = 2 * base; // base = pow(2, base)
        }
        // output
        System.out.print("decimal number is: " + dec_value);
        input.close();
    }
}

