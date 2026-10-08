import java.util.Scanner;
 public class IT26102764Lab3Q4{
    public static void main( String [] args){
      int fiveDigit_no;

      // create the object 
      Scanner input= new Scanner(System.in);

      //get a five digit number from the keyboard
       System.out.println("Enter a five digit number:");
       fiveDigit_no= input.nextInt();

      //Extract each digit 
       int digit1 = fiveDigit_no / 10000;
       int digit2 = (fiveDigit_no / 1000)% 10;
       int digit3 = (fiveDigit_no / 100) % 10;
       int digit4 = (fiveDigit_no / 10) %10;
       int digit5 = fiveDigit_no % 10;
      
      // print digits which are seperated by sapce
       System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

    }
 }