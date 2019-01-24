package Day11_17;

public class OperatorDemo06 {
    public static void main(String[] args) {
     int a=3,b=3;//定义两个变量a和b
     int x=6,y=6;//定义两个变量x和y
        System.out.println("a="+a);
        System.out.println("\t a++ ="+(a++)+",a="+a);//先计算后自增
        System.out.println("\t a++ ="+((a++)+2)+",a="+a);//先计算后自增
        System.out.println("b="+b);
        System.out.println("\t ++b ="+(++b)+",b="+b);//先自增后计算
        System.out.println("\t ++b ="+((++b)+2)+",b="+b);//先自增后计算
        System.out.println("x="+x);
        System.out.println("\t x-- ="+(x--)+",x="+b);//先计算后自减
        System.out.println("\t x-- ="+((x--)+2)+",x="+x);//先计算后自减
        System.out.println("y="+y);
        System.out.println("\t --y ="+(--y)+",y="+y);//先自减后计算
        System.out.println("\t --y ="+((--y)+2)+",y="+y);//先自减后计算
    }
}
