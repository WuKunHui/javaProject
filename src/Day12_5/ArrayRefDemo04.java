package Day12_5;

public class ArrayRefDemo04 {
    public static void main(String[] args) {
        int score[]={67,89,87,69,90,100,75,90};
        int age[]={31,30,18,17,8,9,1,39};
        java.util.Arrays.sort(score);
        print(score);
        System.out.println("\n-----------------------");
        java.util.Arrays.sort(age);
        print(age);
    }
    public static void print(int temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
}
