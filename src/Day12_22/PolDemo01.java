package Day12_22;
/*class A{
    public void fun1(){
        System.out.println("A-->public void fun1()");
    }
    public void fun2(){
        this.fun1();
    }
}
class B extends A{
    public void fun1(){
        System.out.println("B-->public void fun1()");
    }
    public void fun3(){
        System.out.println("B-->public void fun3()");
    }
}
public class PolDemo01 {
    public static void main(String[] args) {
        B b=new B();
        A a=b;
        a.fun1();
        a.fun2();
        ((B) a).fun3();
        /*A a=new B();
        B b=(B)a;
        b.fun1();
        b.fun2();
        b.fun3();
    }
}
*/