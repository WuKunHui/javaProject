package Day12_12;
class Demo{
    int temp=30;
}
public class RefDemo01 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.temp=50;
        System.out.println("fun()��������֮ǰ��"+d1.temp);
        fun(d1);
        System.out.println("fun()��������֮��"+d1.temp);
    }
    public static void fun(Demo d2){
        d2.temp=1000;
    }
}