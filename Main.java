/**
 * This program will add up the integers in the number and see if its divisible by 7 
 * @author Sevde
 */
public class Main {
    public static void main(String[] args) {
   // the number
  System.out.println(checkCode(54));
    }
  // a method to find the sum of integers, and see if its divisible by 7
  public static boolean checkCode ( int number){
  // create a variable called sum that starts with 0 
  int sum = 0;
  // a loop to find the sum 
   while( number > 0){
     // formula to find the sum by find the digits and adding them together
   sum = sum + number % 10;
    // finding the digits 
   number = number / 10;
  }
  
  // a variable to see to put the formula to find if its divisble by 7
   int valid = sum % 7;
   // see if it is divisible by looking at the remainder
   
   if( valid == 0){
     // return true 
     return true;
     //if its not divisible
   }else {
     // return false 
    return false;
    } 
  
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
    
    
   
  }

