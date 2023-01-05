// Write a program in java to show a longest word .
import java.util.Scanner;
 public class Exer1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter word 3 or more or sentence : ");
    String str = sc.nextLine();// user input

    str += " ";
    String word = " " , lWord = " " ;// to stor the longest word 
    int len = str.length(); // to stor the longth of word
    // foction for loop
    for(int i = 0 ;i < len ;i++){
      char ch = str.charAt(i);
      if(ch != ' '){
        word = word + ch;
      }
      else{
        if(word.length() > lWord.length()){
          lWord = word;
          word = " " ;
        }
      }
    }
    // print out
    System.out.println("Longest word is :" + lWord);
    
  }
}