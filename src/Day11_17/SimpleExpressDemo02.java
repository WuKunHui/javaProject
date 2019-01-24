package Day11_17;

public class SimpleExpressDemo02 {
    public static void main(String[] args) {
        int a=10,b=6;
        System.out.println("改变之前的数：a="+a+",b="+b);
        a -=b++;
        System.out.println("改变之前的数：a="+a+",b="+b);

    }
}
