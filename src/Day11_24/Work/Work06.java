package Day11_24.Work;

public class Work06 {
    public static void main(String[] args) {
        int sum =0;
        int x=10;
        do{
            sum +=x;
            x +=10;
            sum -=x;
            x +=10;
        }while (x<=1003);{
            System.out.println(sum);
        }

    }
}
