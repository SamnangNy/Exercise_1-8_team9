/*Ask the user an integer number in arang of [0 ,999],than dispay the number 
 in English
 */

import java.util.*;

public class Exer4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number (3-digit number): ");
        int num = in.nextInt();
        if (num < 0 || num > 999)
            System.out.println("Wrong Input, fu*koff");
        else 
        {
            int u = num % 10; // last digit
            int tt = num / 10;
            int t = tt % 10; // second int
            int h = num / 100; // first digit
            String uw[] = { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "11", "12", "13", "14", "15", "16", "17", "Eighteen", "19", "20" };
            String tw[] = { " ", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "60", "70", "80", "90" };
            String hw = " Hundred ";
            if (num < 20)
                System.out.println(uw[num]);
            else if (num < 100)
                System.out.println(tw[t] + " " + uw[u]);
            else
                System.out.println(uw[h] + hw + tw[t] + " " + uw[u]);
        }
        in.close();
    }
}
