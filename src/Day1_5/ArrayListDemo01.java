package Day1_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> allList=null;
        Collection<String> allCollection=null;
        allList=new ArrayList<String>();
        allCollection=new ArrayList<String>();
        allList.add("hello");
        System.out.println(allList);
        allList.add(0,"World");
        allCollection.add("ZY");
        allCollection.add("WWW.Yjsj.com");
        allList.addAll(allCollection);
        allList.addAll(0,allCollection);
        System.out.println(allList);
    }

}
