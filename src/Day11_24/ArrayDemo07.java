package Day11_24;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int score[] ={67,89,87,69,90,100,75,90};
        for(int i=1;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if (score[i] < score[j]) {
                int temp =score[i];
                score[i] =score[j];
                score[j] =temp;
                }
            }
            System.out.println("第"+i+"次排序的结果：");
            for(int j=0;j<score.length;j++){
                System.out.println(score[j]+"\t");
            }
            System.out.println("");
        }
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]+"\t");
        }
    }
}
