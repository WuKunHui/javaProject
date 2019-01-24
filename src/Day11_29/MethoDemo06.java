package Day11_29;

public class MethoDemo06 {
    public static void main(String[] args) {
        System.out.println("¼ÆËã½á¹û£º"+sum(100));
    }
    public static int sum(int num){
        if(num==1){
            return 1;
        }else {
            return num+sum(num-1);
        }
    }
}
