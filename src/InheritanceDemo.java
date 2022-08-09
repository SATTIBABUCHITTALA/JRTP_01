
class C extends B {

    void getC(){

        System.out.println("IN class C");
    }

    void getA(){

        System.out.println("IN class C from A");
    }

}


//Java Does not support the multiple inheritance through classes
class B extends A{
    void getB(){

        System.out.println("IN class B");
    }


}
class A{

    void getA(){

        System.out.println("IN class A");
    }

}
class D {
    void getA(){

        System.out.println("IN class D");
    }


}

public class InheritanceDemo {

    public static void main(String args[]){
        B b=new B();
        //classname refrerenceVariable =new classname();
            b.getB();
            b.getA();

            C c=new C();
            c.getC();
            c.getB();
            c.getA();


            b.getA();

    }


}
