package Day11_17;

public class OperatorDemo08 {
    public static void main(String[] args) {
        int score =50;                  //定义变量score
        if((score<0)||(score>100)){     //判断成绩是否有错
            System.out.println("输入的成绩有错误！");
        }
        if((score<60)&&(score>49)){     //判断成绩结果
            System.out.println("成绩不合格，准备补考吧！");
        }
    }
}
