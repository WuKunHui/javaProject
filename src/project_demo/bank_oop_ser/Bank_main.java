package week.project_demo.bank_oop_ser;

public class Bank_main {
    public static void main(String[] args){
        Menu menu=new Menu();
        menu.init();
        for(;;){
            if(menu.menu==1){
                menu.login();
            }
            else if(menu.menu==2){
                menu.bankinfo();
            }
            else if(menu.menu==0){
                break;
            }
        }
    }
}