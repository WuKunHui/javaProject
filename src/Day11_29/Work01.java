package Day11_29;

public class Work01 {
    public static void main(String[] args) {
        long sum=0;
        for(int i=1;i<=21;++i){
            sum +=fun(i);
        }
        System.out.println("½×³ËµÄºÍÎª£º"+sum);
    }
    public static int fun(int j){
        int temp=1;
        for(int k=1;k<=j;++k){
            temp *=k;
        }
        return temp;
    }
}
