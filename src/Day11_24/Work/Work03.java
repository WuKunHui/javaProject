package Day11_24.Work;

public class Work03 {
    public static void main(String[] args) {
        int max=0;
        int x=9;
     int y=2;
     max=x>y?x:y;
        System.out.println("x、y中较大的值为："+max);
        int z=15;
        if(x>z){
            System.out.println("最大值为："+x);
        }else{
            System.out.println("最大值为："+z);
        }
    }
}
