package Day11_24.Work;

import java.util.Scanner;

public class Work04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        double a = sc.nextDouble();
        if (a % 3 == 0 & a % 5 == 0 & a % 7 == 0) {
            System.out.println("�����ܱ�3��5��7ͬʱ����");
        } else {
            System.out.println("�������ܱ�3��5��7ͬʱ����");
        }
    }
}
