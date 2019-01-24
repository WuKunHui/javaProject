package Day11_24;

public class ArrayDemo02{
    public static void main(String[] args) {
        int score[] =null;
        score =new int[3];
        for(int x=0;x<3;x++){
            score[x]=x*2+1;
        }
        for(int x=0;x<score.length;x++){
            System.out.println("score["+x+"]="+score[x]);
        }
    }
}
