import java.util.Scanner;
public class IT26102764Lab3Q2{
    public static void main(String [] args){
        double monthly_salary,ot_hours,rate,ot_amount,total_salary;

        // create the object
        Scanner input= new Scanner(System.in);

        // get user input for the monthly salary
         System.out.println("Enter the monthly salary:");
         monthly_salary=input.nextDouble();

        //get user input for the OT hours
        System.out.println("Enter the number of OT hours:");
        ot_hours= input.nextDouble();

        //get user input for the OT hourly rate
         System.out.println("Enter the OT hourly rate:");
         rate= input.nextDouble();

         //calculate the Ot amount
          ot_amount= ot_hours * rate;
          
        // calculate the total salary
         total_salary= monthly_salary + ot_amount;
         System.out.println("The total salary including OT is:" + total_salary);

    }
}