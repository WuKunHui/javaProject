package Day11_24.Work;

public class Work11 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=20;i++){
            int n=1;
            for(int j=1;j>0;j--){
                n = n*j;
            }
                sum = sum+n;
            }
                System.out.println(sum);
            }
        }


