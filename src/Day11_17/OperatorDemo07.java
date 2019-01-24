package Day11_17;

public class OperatorDemo07 {
    public static void main(String[] args) {
        boolean a=true;                    //定义布尔变量，默认为ture
        boolean b=false;                   //定义布尔变量，默认为flase
        System.out.println("a||b="+(a||b));//执行短路或操作
        System.out.println("a|b="+(a|b));  //执行或操作
        System.out.println("a&&b="+(a&&b));//执行短路与操作
        System.out.println("a&b="+(a&b));//执行与操作
    }
}
