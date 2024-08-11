import java.text.NumberFormat;
import java.util.Scanner;

class Main{


 public static void main(String[] args){
     final byte MONTHS_IN_A_YEAR=12;
     final byte PERCENT=100;
     Scanner input= new Scanner(System.in);
   System.out.print("PRINCIPAL: ");
   int Principal=input.nextInt();

   System.out.print("INTEREST: ");
   float interest=input.nextFloat();
   double interest_per_month=interest/MONTHS_IN_A_YEAR/PERCENT;


   System.out.print("PERIOD(YEARS): ");
   byte period=input.nextByte();
   short number_of_payments= (short)(period*MONTHS_IN_A_YEAR);


   double mortgage=Principal*
           (
                   (interest_per_month*Math.pow((interest_per_month+1),number_of_payments))
                    /
                    (Math.pow((interest_per_month+1),number_of_payments)-1)
           );
   System.out.print("MORTGAGE:"+NumberFormat.getCurrencyInstance().format(mortgage));




    }
}