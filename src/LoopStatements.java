import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LoopStatements {
        int num=0;
    static{
        System.out.println("Satic block");
        int k=0;
        int n=0;
    }

    public static void main(String args[]){ //Array {"Satti","30", "babu" }
        System.out.println("Main Method");
        /*args[0] ="Satti";  ctrl+shift+/
        args[1] =30;
        args[2] ="babu";*/
        System.out.println(args[0]);

        //list of elements =====10 elements array ---args[]
        //String name[]={"sattibabu","Harsha","Kiran"};
        //name[0],name[1],------name[9];
        //String name1= "Harsha";
        //String name2="Kiran";

        //Arrays//args[0] ="Sattibabu",args[1]="EVM",args[2]="India", args[3]="Tadepalligudem";
        for(int i=0;i<args.length;i++){  //i=0--9
            if(i==2)
                break;
            System.out.println("Args values"+i+" " + args[i]);
        }
       System.out.println("Enhanced For Loop");
       for(String str:args){
           System.out.println(str);
       }
       //continue

        for(int i=0;i<10;i++){ //0 1  2 3 4 ----9
            if(i==5)
                continue;
            System.out.println(i);
        }

        //i=5;
        //while
         //1000 records id=456;
        int i=6;
        while(i<10){

            System.out.println("IValue "+ i);
            i++;

        }
        //i=10;
//It will give one iteration before validating the condition.
        do{

        System.out.println("Hi Chenna");
            i++;
        }while(i<=11); //i=11 ,i=  12<11

        System.out.println("I Value"+ i);



    }




}
