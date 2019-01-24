package Day11_24.Work;

public class Work05 {
    public static void main(String[] args) {
       //int x= 100;
       int sum=0;
       /*while(x<=200){
           sum +=x;
           x++;
       }*/
       /*do{
           sum += x;
           x++;
       }while (x<=200);*/
       for(int x=100;x<=200;x++){
           sum += x;
       }
        System.out.println("100-->200累加结果为："+sum);
    }
}

