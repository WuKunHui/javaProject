package day0118;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Menu {
    Operator mOperator;
    public void List()throws Exception{
        mOperator = new Operator();
        Scanner scanner=new Scanner(System.in);
        int nValue = 0;
        while (true){
           System.out.println("1.增加数据");
           System.out.println("2.删除数据");
           System.out.println("3.修改数据");
           System.out.println("4.查找数据");
           System.out.println("5.显示所有数据");
           System.out.println("0.退出系统");
           System.out.println("请输入选择项：");
           nValue = scanner.nextInt();
           if (nValue == 0){
               break;
           }else{
              this.Operator(nValue);
           }
        }
        System.exit(1);
    }
    public void Operator(int nValue) throws Exception{
        switch (nValue){
            case 1:{
                BufferedReader buf = null;
                buf = new BufferedReader(new InputStreamReader(System.in));
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入用户名：");
                String strValue = buf.readLine();
                System.out.println("请输入年龄：");
                int nAge = scanner.nextInt();
                Person nPerson = new Person(strValue,nAge);
                mOperator.Add(nPerson);
                break;
            }
            case 2:{
                BufferedReader buf = null;
                buf = new BufferedReader(new InputStreamReader(System.in));
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入用户名：");
                String Value = buf.readLine();
                mOperator.Del(Value);
                break;
            }
            case 3:{
//                BufferedReader buf = null;
//                buf = new BufferedReader(new InputStreamReader(System.in));
//                Scanner scanner=new Scanner(System.in);
//                System.out.println("请输入用户名：");
//                String strValue = buf.readLine();
//                System.out.println("请输入年龄：");
//                int nAge = scanner.nextInt();
//                Person nPerson = new Person(strValue,nAge);
//                mOperator.Add(nPerson);
                BufferedReader buf = null;
                buf = new BufferedReader(new InputStreamReader(System.in));
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入用户名：");
                String Value = buf.readLine();
                mOperator.Modi(Value);
                break;

            }
            case 4:{
                BufferedReader buf = null;
                buf = new BufferedReader(new InputStreamReader(System.in));
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入用户名：");
                String strValue = buf.readLine();
                mOperator.Find(strValue);
                break;
            }
            case 5: {
               mOperator.DisplayAll();
               break;
            }
            default:{
                System.out.println("No Find Data Value:"+nValue);
            }
        }
    }
}

