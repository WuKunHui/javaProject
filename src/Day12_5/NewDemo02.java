package Day12_5;

public class NewDemo02 {
    public static void main(String[] args) {
        System.out.println("�����ݲ�����fun())");
        fun();
        System.out.println("\n����һ��������fun(1))");
        fun(1);
        System.out.println("\n�������������fun(1,2,3,4,5))");
        fun(1,2,3,4,5);
    }
    public static void fun(int ... arg){
        for(int x:arg){
            System.out.println(x+"��");
        }
    }
}