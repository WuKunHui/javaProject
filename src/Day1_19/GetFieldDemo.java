package Day1_19;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetFieldDemo {
    public static void main(String[] args) {
        Class<?>c1=null;
        try {
            c1=Class.forName("Day1_19.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        {
            Field f[]=c1.getDeclaredFields();
            for(int i=0;i<f.length;i++){
                Class<?>r=f[i].getType();
                int mo=f[i].getModifiers();
                String priv=Modifier.toString(mo);
                System.out.print("本类属性：");
                System.out.print(priv+" ");
                System.out.print(r.getName()+" ");
                System.out.print(f[i].getName());
                System.out.println(" ;");
            }
        }
        {
            Field f[]=c1.getFields();
            for(int i=0;i<f.length;i++){
                Class<?>r=f[i].getType();
                int mo=f[i].getModifiers();
                String priv=Modifier.toString(mo);
                System.out.print("公共属性：");
                System.out.print(priv+" ");
                System.out.println(r.getName()+" ");
                System.out.println(f[i].getName());
                System.out.println(" ;");
            }
        }
    }
}
