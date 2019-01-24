package day0118;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Operator {
    private ArrayList<Person> person_list;
    private UtilIo mutilio;
    public Operator() throws Exception {
       mutilio = new UtilIo();
       mutilio.SetFileName("perdeson_info.txt");
       person_list = new ArrayList<Person>();
       person_list = mutilio.Reader();
    }

    public void Add(Person person)throws Exception{
        System.out.println("Operator Add:"+this.person_list.size());
        this.person_list.add(person);
        mutilio.Write(this.person_list);
        System.out.println("Operator Adder:"+this.person_list.size());
    }
    public void Del(String delPerson)throws Exception{
        System.out.println("Operator Del."+this.person_list.size());
        ArrayList<Person>person_list = mutilio.Reader();
        for(int i=0;i<person_list.size();i++) {
            if (person_list.get(i).GetName().equals(delPerson)) {
                person_list.remove(person_list.get(i));
                mutilio.Write(person_list);
                System.out.println("Del result:" + person_list);
                break;
            }
        }

    }
    public void Modi(String modPerson) throws  Exception{
//        System.out.println("Operator Modi.");
//        ArrayList<Person>person_list = mutilio.Reader();
//        for(int i=0;i<person_list.size();i++) {
//            if (person_list.get(i).GetName().equals(modPerson)) {
//                person_list.get(i).setName();
//                mutilio.Write(person_list);
//                System.out.println("Del result:" + person_list);
//                break;
//            }
//        }
        ArrayList<Person>person_list = mutilio.Reader();
        for(int i=0;i<person_list.size();i++) {
            if (person_list.get(i).GetName().equals(modPerson)) {
                BufferedReader buf = null;
                buf = new BufferedReader(new InputStreamReader(System.in));
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入修改后的用户名：");
                String strValue = buf.readLine();
                System.out.println("请输入修改后的年龄：");
                int nAge = scanner.nextInt();
                person_list.get(i).setName(strValue);
                person_list.get(i).SetAge(nAge);
                mutilio.Write(person_list);
                System.out.println("Del result:" + person_list);
                break;
            }
        }
    }
    public void DisplayAll() throws Exception{
        ArrayList<Person>person_list = mutilio.Reader();
        for(int i=0;i<person_list.size();i++){
                System.out.println("Find result:"+person_list.get(i));
        }
    }
    public void Find(String strName) throws Exception{
        System.out.println("Operator Find.");
        //System.out.println(mutilio.Reader());
        ArrayList<Person>person_list = mutilio.Reader();
        boolean isFind = false;
        for(int i=0;i<person_list.size();i++){
            if(person_list.get(i).GetName().equals(strName)){
                System.out.println("Find result:"+person_list.get(i));
                isFind = true;
            }
        }
        if (!isFind){
            System.out.println("No Find Info:"+strName);
        }
    }
}
