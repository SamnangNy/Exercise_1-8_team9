/**
 * 2. Ask the user to enter a sentence, then capitalizes the first character of each word in the sentence.
 * */
import java.util.Scanner;
public class Exer2 {
    public static void main(String[] args) {

        // declare variable
        String text;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter statement: ");
        text = input.nextLine();

        // stores each characters to a char array
        char[] charArray = text.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if(Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if(foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                // if the new character is not character
                foundSpace = true;
            }
        }
        // convert the char array to the string
        text = String.valueOf(charArray);
        System.out.println("Result: " + text);
    }

}