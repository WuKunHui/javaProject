package week.project_demo.bank_oop_ser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends IOUtil {
    private ArrayList<User> users = new ArrayList<User>();
    public int menu = 1;
    private Scanner scanner = new Scanner(System.in);
    //��ȡ��ǰ��½�˵Ķ�����Ϣ
    private int index = -1;

    //��ʼ�������û���Ϣ
    public void init() {
        try {
            users = read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeRead();
        }
    }

    //��½����
    public void login() {
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


    public void bankinfo() {
        for (; ; ) {
            System.out.println("1����ѯ��� 2����Ǯ 3��ȡ�� 4��ת�� 5���޸ĸ������� 6�����ص�½ 7���˳�");
            String choose = scanner.next();
            if (choose.equals("1")) {
                System.out.println(users.get(index).getName() + "�������:" + users.get(index).getMoney());
            } else if (choose.equals("2")) {
                System.out.println("����������");
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
                    System.out.println("���������ѽ������.");
                }
            } else if (choose.equals("3")) {
                System.out.println("���������ѽ��");
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
                    System.out.println("����");
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
                        try {
                            write(users);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            closeWrite();
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
                    try {
                        write(users);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        closeWrite();
                    }
                } else {
                    System.out.println("�����������");
                }
            }
        }
    }
}