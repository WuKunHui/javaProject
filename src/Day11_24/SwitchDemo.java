package Day11_24;

public class SwitchDemo {
    public static void main(String[] args) {
        int x=3;
        int y=6;
        char oper='+';
        switch (oper){
            case '+':{
                System.out.println("x+y="+(x+y));
                break;
            }
            case '-':{
                System.out.println("x-y="+(x-y));
                break;
            }case '*':{
                System.out.println("x*y="+(x*y));
                break;
            }case'/':{
                System.out.println("x/y="+(x/y));
                break;
            }
            default:{
                System.out.println("Î´ÖªµÄ²Ù×÷£¡");
                break;
            }
        }
    }
}
