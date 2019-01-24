package Day12_5;

public class ArrayRefDemo02 {
    public static void main(String[] args) {
        int temp[] = fun();
        print(temp);
    }
    public static void print(int x[]){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]+"¡¢");
        }
    }
    public static int[] fun(){
        int ss[]={1,3,5,7,9};
        return ss;
    }
}
