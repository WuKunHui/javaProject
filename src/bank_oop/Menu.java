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
    //��ȡ��ǰ��½�˵Ķ�����Ϣ
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

    //��ʼ�������û���Ϣ
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

    //��½����
    public void login() throws Exception {
        for (; ; ) {
            index = -1;
            System.out.println("�������˺�");
            String name = scanner.next();
            System.out.println("����������");
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
                System.out.println("�˺Ų����ڻ����������");
            }
        }
    }

    //  �˵�ѡ��
    public void bankinfo() {
        for (; ; ) {
            System.out.println("1����ѯ��� 2����Ǯ 3��ȡ�� 4��ת�� 5���޸ĸ������� 6�����ص�½ 7���˳�");
            String choose = scanner.next();
            if (choose.equals("1")) {
                System.out.println(users.get(index).getName() + "�������:" + users.get(index).getMoney());
            } else if (choose.equals("2")) {
                System.out.println("���������");
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
                    System.out.println("���������");
                }
            } else if (choose.equals("3")) {
                System.out.println("���������ѽ�");
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
                System.out.println("������ת����˺�");
                String no = scanner.next();
                int id = -1;
                for (int i = 0; i < users.size(); i++) {
                    if (no.equals(users.get(i).getName()) && i != index) {
                        id = i;
                        break;
                    }
                }
                if (id >= 0) {
                    System.out.println("������ת�˽��");
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
                        System.out.println("����");
                    }
                } else {
                    System.out.println("���˺Ų�����");
                }
            } else if (choose.equals("6")) {
                menu = 1;
                break;
            } else if (choose.equals("7")) {
                menu = 0;
                break;
            } else if (choose.equals("5")) {
                System.out.println("�����������");
                String oldpwd = scanner.next();
                if (oldpwd.equals(users.get(index).getPwd())) {
                    System.out.println("������������");
                    String newPwd = scanner.next();
                    System.out.println("��ȷ��������");
                    String newPwd1 = scanner.next();
                    if (newPwd.equals(newPwd1)) {
                        users.get(index).setPwd(newPwd);
                    } else {
                        System.out.println("�����������벻һ��");
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
                    System.out.println("�����������");
                }
            }
        }
    }
}
