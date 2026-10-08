import java.util.Scanner;
 public class IT26102764Lab3Q3{
    public static void main (String[] args){

        // defining the variables
        int amount=0;

        int count5000 = 0;
        int count1000 = 0;
        int count500 = 0;
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count2 = 0;
        int count1 = 0;

        //create the object
        Scanner input= new Scanner(System.in);

        //Get user input for the amount
        System.out.println("Enter the Rupee amount:");
        amount=input.nextInt();

        count5000 = amount / 5000;
        amount= amount % 5000;

        count1000 = amount/1000;
        amount= amount % 1000;

        count500 = amount / 500;
        amount = amount % 500;

        count100 = amount / 100;
        amount = amount % 100;

        count50 = amount / 50;
        amount = amount % 50;
         
        count20 = amount / 20;
        amount = amount % 20;
        
        count10 = amount / 10;
        amount = amount %  10;
        
        count5 = amount / 5;
        amount = amount % 5;

        count2 = amount /2;
        amount = amount % 2;
        
        count1= amount / 1;
        amount = amount % 1;

        //print the no of each note n coins

        System.out.println();
        System.out.println("5000 notes - " + count5000);
        System.out.println("1000 notes - " + count1000);
        System.out.println("500 notes - " + count500);
        System.out.println("100 notes - " + count100);
        System.out.println("50 notes - " + count50);
        System.out.println("20 notes - " + count20);
        System.out.println("10 coins - " + count10);
        System.out.println("05 coins - " + count10);
        System.out.println("02 coins - " + count2);
        System.out.println("01 coins - " + count1);





    }
 }