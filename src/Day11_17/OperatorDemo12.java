package Day11_17;

public class OperatorDemo12 {
    public static void main(String[] args) {
        if(10==10|10/0==0){      //非短路或
            System.out.println("条件满足");
        }
    }
}
