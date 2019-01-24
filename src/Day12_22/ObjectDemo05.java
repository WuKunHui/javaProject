package Day12_22;

public class ObjectDemo05 {
    public static void main(String[] args) {
        int temp[]={1,3,5,7,9};
        Object obj=temp;
        print(obj);
    }
    public static void print(Object O){
        if(O instanceof  int[]){
            int x[]=(int[])O;
            for(int i=0;i<x.length;i++){
                System.out.println(x[i]+"\t");
            }
        }
    }
}
