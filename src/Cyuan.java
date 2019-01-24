import java.util.Scanner;

public class Cyuan {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        int r=sc.nextInt();
        double C;
        C=2*3.14*r;
        System.out.println("圆的周长是："+C);
    }
}