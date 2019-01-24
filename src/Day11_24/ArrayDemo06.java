package Day11_24;

public class ArrayDemo06 {
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
        }
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]+"\t");
        }
    }
}
