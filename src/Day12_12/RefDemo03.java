package Day12_12;
class Demo01{
    String temp="hello";
}
public class RefDemo03 {
    public static void main(String[] args) {
        Demo01 d1=new Demo01();
        d1.temp="world";
        System.out.println("fun（）方法调用之前"+d1.temp);
        fun(d1);
        System.out.println("fun（）方法调用之后"+d1.temp);
    }
    public static void fun(Demo01 d2){
        d2.temp="MLDN";
    }
}
