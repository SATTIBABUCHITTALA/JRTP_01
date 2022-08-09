import java.util.Scanner;

public class ConditionalStatementDemo {

    public static void main(String args[]){

        System.out.println("Please Enter your Age!! ");


         Scanner scr=new Scanner(System.in);

         int age=scr.nextInt();

         if(age>0 &&  age<=18 ) {

            System.out.println("He is not eligible for Voting");
        }else  if(age>18 && age<100){
             System.out.println("He is eligible for Voting");
         }else {

             System.out.println(" Invalid Entry Please Check again!!");
         }




    }


}
