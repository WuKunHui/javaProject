package day0118;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]){
        List<Person>allList = null;
        allList =  new ArrayList<Person>();
        Person person = new Person("zhangsan",18);
        Person person1 = new Person("lisi",19);
        allList.add(person);
        allList.add(person1);
        System.out.println(allList.size());
        System.out.println(allList);
        for(int i=0;i<allList.size();i++){
            if(allList.get(i).GetName().equals("zhangsan")){
                allList.remove(i);
                //allList.get(i).SetAge(20);
                //System.out.println(allList.get(i));
                break;
            }
        }
        System.out.println(allList);
    }
}
