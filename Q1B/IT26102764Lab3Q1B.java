import java.util.Scanner;
 public class IT26102764Lab3Q1B{
    public static void main ( String[] args){
        double price,kilograms,discounted_price;

        //create the object
         Scanner input = new Scanner( System.in);

        // get user input for the 1kg price
         System.out.println("Enter the price of 1kg of rice:" );
         price= input.nextDouble();

        //get user input for the number of kilograms
         System.out.println("Enter the number of kilograms you want ot buy:");
         kilograms = input.nextDouble();

        // calculate the total price
         discounted_price = price * kilograms*10/100;
         System.out.println("The total amount is:" + discounted_price);
    }
 }