package Day1_19;

import java.lang.reflect.Constructor;

public class InstanceDemo03 {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c=Class.forName("Day1_19.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person per=null;
        Constructor<?>cons[]=null;
        cons=c.getConstructors();
        try {
            per=(Person)cons[0].newInstance("уесб",30);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(per);
    }
}
