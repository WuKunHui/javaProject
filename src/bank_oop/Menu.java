package bank_oop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<User> users = new ArrayList<User>();
    public int menu = 1;
    private Scanner scanner = new Scanner(System.in);
    //获取当前登陆人的对象信息
    private int index = -1;

    public void storeMessage() {
        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User();
        u1.setName("admin");
        u1.setPwd("admin");
        u1.setMoney(new BigDecimal(1000));
        User u2 = new User();
        u2.setName("test");
        u2.setPwd("test");
        u2.setMoney(new BigDecimal(500));
        users.add(u1);
        users.add(u2);
        IOUtil util = new IOUtil();
        try {
            util.write(users);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            util.closeWrite();
        }
    }

    //初始化银行用户信息
    public void init() {
        IOUtil util = new IOUtil();
        try {
            users = util.read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            util.closeRead();
        }
    }

    //登陆功能
    public void login() throws Exception {
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

    //  菜单选项
    public void bankinfo() {
        for (; ; ) {
            System.out.println("1、查询余额 2、存钱 3、取款 4、转账 5、修改个人密码 6、返回登陆 7、退出");
            String choose = scanner.next();
            if (choose.equals("1")) {
                System.out.println(users.get(index).getName() + "的余额是:" + users.get(index).getMoney());
            } else if (choose.equals("2")) {
                System.out.println("请输入存款金额：");
                Float addMoney;
                BufferedReader buf = null;
                buf = new BufferedReader(new InputStreamReader(System.in));
                addMoney = Float.parseFloat(String.valueOf(buf));
                if (addMoney > 0) {
                    users.get(index).setMoney(users.get(index).getMoney().add(new BigDecimal(addMoney)));
                    IOUtil ioUtil = new IOUtil();
                    try {
                        ioUtil.write(users);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        ioUtil.closeWrite();
                    }
                } else if (addMoney < 0) {
                    System.out.println("存款金额有误！");
                }
            } else if (choose.equals("3")) {
                System.out.println("请输入消费金额：");
                Float decMoney;
                BufferedReader buff = null;
                buff = new BufferedReader(new InputStreamReader(System.in));
                decMoney = Float.parseFloat(String.valueOf(buff));
                if (decMoney > 0) {
                    users.get(index).setMoney(users.get(index).getMoney().subtract(new BigDecimal(decMoney)));
                    IOUtil ioUtil = new IOUtil();
                    try {
                        ioUtil.write(users);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        ioUtil.closeWrite();
                    }
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
                        IOUtil ioUtil = new IOUtil();
                        try {
                            ioUtil.write(users);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            ioUtil.closeWrite();
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
                    IOUtil ioUtil = new IOUtil();
                    try {
                        ioUtil.write(users);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        ioUtil.closeWrite();
                    }
                } else {
                    System.out.println("密码输入错误");
                }
            }
        }
    }
}
