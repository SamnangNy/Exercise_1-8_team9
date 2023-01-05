/*Create array of country names,than sorts the array alphatically. */

import java.util.Arrays;
public class Exer3 {
  public static void main(String[] args){
    //set name of countries to array string
    String[] countries = { "Cambodia" ,"africa" ,"thailand" ,"india" ,"Ukrain" };
    //sorting alphabetically
    Arrays.sort(countries,String.CASE_INSENSITIVE_ORDER);
    //output
    System.out.print(Arrays.toString(countries));
  }
}
