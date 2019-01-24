package week.project_demo.bank_oop_ser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends IOUtil {
    private ArrayList<User> users = new ArrayList<User>();
    public int menu = 1;
    private Scanner scanner = new Scanner(System.in);
    //获取当前登陆人的对象信息
    private int index = -1;

    //初始化银行用户信息
    public void init() {
        try {
            users = read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeRead();
        }
    }

    //登陆功能
    public void login() {
        for (; ; ) {
            index = -1;
            System.out.println("请输入账号");
            String name = scanner.next();
            System.out.println("请输入密码");
            String pwd = scanner.next();
            for (int i = 0; i < users.size(); i++) {
                if (name.equals(users.get(i).getName()) && pwd.equals(users.get(i).getPwd())) {
                    index = i;
                    break;
                }
            }
            if (index >= 0) {
                menu = 2;
                break;
            } else {
                System.out.println("账号不存在或者密码错误");
            }
        }
    }


    public void bankinfo() {
        for (; ; ) {
            System.out.println("1、查询余额 2、存钱 3、取款 4、转账 5、修改个人密码 6、返回登陆 7、退出");
            String choose = scanner.next();
            if (choose.equals("1")) {
                System.out.println(users.get(index).getName() + "的余额是:" + users.get(index).getMoney());
            } else if (choose.equals("2")) {
                System.out.println("请输入存款金额");
                BigDecimal m = scanner.nextBigDecimal();
                if (m.longValue() > 0) {
                    users.get(index).setMoney(users.get(index).getMoney().add(m));
                    try {
                        write(users);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        closeWrite();
                    }
                }else{
                    System.out.println("请输入消费金额有误.");
                }
            } else if (choose.equals("3")) {
                System.out.println("请输入消费金额");
                BigDecimal m = scanner.nextBigDecimal();
                if (m.longValue() > 0 && (users.get(index).getMoney().compareTo(m)>=0)) {
                    users.get(index).setMoney(users.get(index).getMoney().subtract(m));
                    try {
                        write(users);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        closeWrite();
                    }
                }
                else{
                    System.out.println("余额不足");
                }
            } else if (choose.equals("4")) {
                System.out.println("请输入转入的账号");
                String no = scanner.next();
                int id = -1;
                for (int i = 0; i < users.size(); i++) {
                    if (no.equals(users.get(i).getName()) && i != index) {
                        id = i;
                        break;
                    }
                }
                if (id >= 0) {
                    System.out.println("请输入转账金额");
                    BigDecimal m = scanner.nextBigDecimal();
                    if (m.compareTo(users.get(index).getMoney()) < 0) {
                        users.get(index).setMoney(users.get(index).getMoney().subtract(m));
                        users.get(id).setMoney(users.get(id).getMoney().add(m));
                        try {
                            write(users);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            closeWrite();
                        }
                    } else {
                        System.out.println("余额不足");
                    }
                } else {
                    System.out.println("该账号不存在");
                }
            } else if (choose.equals("6")) {
                menu = 1;
                break;
            } else if (choose.equals("7")) {
                menu = 0;
                break;
            } else if (choose.equals("5")) {
                System.out.println("请输入旧密码");
                String oldpwd = scanner.next();
                if (oldpwd.equals(users.get(index).getPwd())) {
                    System.out.println("请输入新密码");
                    String newPwd = scanner.next();
                    System.out.println("请确认新密码");
                    String newPwd1 = scanner.next();
                    if (newPwd.equals(newPwd1)) {
                        users.get(index).setPwd(newPwd);
                    } else {
                        System.out.println("两次密码输入不一致");
                    }
                    try {
                        write(users);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        closeWrite();
                    }
                } else {
                    System.out.println("密码输入错误");
                }
            }
        }
    }
}