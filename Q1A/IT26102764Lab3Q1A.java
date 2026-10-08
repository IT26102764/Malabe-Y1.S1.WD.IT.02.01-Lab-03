import java.util.Scanner;
 public class IT26102764Lab3Q1A{
    public static void main ( String[] args){
        double price,kilograms,total_price;

        //create the object
         Scanner input = new Scanner( System.in);

        // get user input for the 1kg price
         System.out.println("Enter the price of 1kg of rice:" );
         price= input.nextDouble();

        //get user input for the number of kilograms
         System.out.println("Enter the number of kilograms you want ot buy:");
         kilograms = input.nextDouble();

        // calculate the total price
         total_price = price * kilograms;
         System.out.println("The total amount is:" + total_price);
    }
 }