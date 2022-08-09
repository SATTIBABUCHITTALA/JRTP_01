import java.util.Scanner;

public class SwitchStamentDemo {

    static{

        int i=0;

    }

    public static void main(String args[]){


        Scanner scr=new Scanner(System.in);
        System.out.println("Please Enter the Day");
        int day = scr.nextInt();
        //0="Sunday", 1="Monday",2 ="Tuesday",3="Wednesday"
        //break;

        //2022, 2020, 1998,
        switch(day){

            case 0: System.out.println("Today is Sunday");
                    break;
            case 1: System.out.println("Today is Monday");
                    break;
            case 2: System.out.println("Today is Tuesday");
                    break;
            case 3: System.out.println("Today is Wednesday");
                    break;
            case 4: System.out.println("Today is Thursday");
                    break;
            case 5: System.out.println("Today is Friday");
                    break;
            case 6: System.out.println("Today is Saturday");
                    break;
            default:System.out.println("Invalid Entry");



        }



    }


}
