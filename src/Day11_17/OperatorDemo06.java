package Day11_17;

public class OperatorDemo06 {
    public static void main(String[] args) {
     int a=3,b=3;//������������a��b
     int x=6,y=6;//������������x��y
        System.out.println("a="+a);
        System.out.println("\t a++ ="+(a++)+",a="+a);//�ȼ��������
        System.out.println("\t a++ ="+((a++)+2)+",a="+a);//�ȼ��������
        System.out.println("b="+b);
        System.out.println("\t ++b ="+(++b)+",b="+b);//�����������
        System.out.println("\t ++b ="+((++b)+2)+",b="+b);//�����������
        System.out.println("x="+x);
        System.out.println("\t x-- ="+(x--)+",x="+b);//�ȼ�����Լ�
        System.out.println("\t x-- ="+((x--)+2)+",x="+x);//�ȼ�����Լ�
        System.out.println("y="+y);
        System.out.println("\t --y ="+(--y)+",y="+y);//���Լ������
        System.out.println("\t --y ="+((--y)+2)+",y="+y);//���Լ������
    }
}
