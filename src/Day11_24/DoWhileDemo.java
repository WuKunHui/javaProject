package Day11_24;

public class DoWhileDemo {
    public static void main(String[] args) {
        int x=1;
        int sum=0;
        do{
            sum +=x;
            x++;
        }while (x<=10);
        System.out.println("1-->10累加结果为："+sum);
    }
}
