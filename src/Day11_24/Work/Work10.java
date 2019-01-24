package Day11_24.Work;

public class Work10 {
    public static void main(String[] args) {
     for(int x=1;x<=1000;x++){
         if(x%3==0 & x%5==0 & x%7==0){
             System.out.println("可以同时被3、5、7整除的数："+x);
         }else {
             continue;
         }
     }
    }
}
