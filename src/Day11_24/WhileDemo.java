package Day11_24;

public class WhileDemo {
    public static void main(String[] args) {
        int x=1;
        int sum=0;
        while (x <= 10) {
            sum +=x;
            System.out.println("x为："+x+"  sum:"+sum);
            x++;
        }
        System.out.println("1-->10累加结果为："+sum);
    }
}
