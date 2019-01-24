package week.project_demo.bank_oop_ser;
import java.math.BigDecimal;
import java.util.ArrayList;

public class InitUsers {
    public static void main(String[] args){
        ArrayList<User> users=new ArrayList<User>();
        User u1 = new User();
        u1.setName("admin");
        u1.setPwd("123");
        u1.setMoney(new BigDecimal(1000));
        User u2 = new User();
        u2.setName("test");
        u2.setPwd("test");
        u2.setMoney(new BigDecimal(500));
        User u3 = new User();
        u3.setName("张三");
        u3.setPwd("1");
        u3.setMoney(new BigDecimal(1200));
        User u4 = new User();
        u4.setName("李四");
        u4.setPwd("2");
        u4.setMoney(new BigDecimal(5000));
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        IOUtil ioUtil=new IOUtil();
        try {
            ioUtil.write(users);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ioUtil.closeWrite();
        }
    }
}