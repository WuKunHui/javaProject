package Day11_29;

public class MethoDemo05 {
    public static void main(String[] args) {
        System.out.println("1、调用fun方法之前。");
        fun(10);
        System.out.println("2、调用fun方法之后。");
    }
    public static void fun(int x){
        System.out.println("3、进入fun方法");
        if(x==10){
            return;
        }
        System.out.println("4、正常执行完fun方法。");
    }
}
