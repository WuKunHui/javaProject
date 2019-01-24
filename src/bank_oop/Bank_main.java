package bank_oop;

public class Bank_main {
    public static void main(String[] args) throws Exception {
        Menu menu=new Menu();
        menu.storeMessage();
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