package Day11_24.Work;

public class Work01 {
    public static void main(String args[]){
        int x,y,z,i;
        for(i=100;i<=999;i++){
            x=i/100;
            y=(i%100)/10;
            z=i%10;
            if(x*x*x+y*y*y+z*z*z==i){
                System.out.println(i);
            }
        }
    }
}
