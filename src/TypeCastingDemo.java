public class TypeCastingDemo {

public static void main(String args[]){

    int i=20; //4 bytes
    System.out.println("Int Value "+ i);
    double dbl=i; //8 bytes  //4 bytes ---> 8 bytes
    System.out.println("Double Value "+ dbl);

    int k=(int)dbl;
    System.out.println("K value "+k);//8 bytes --- >4 bytes


}

}
