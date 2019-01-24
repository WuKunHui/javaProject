package Day1_19;

import java.lang.reflect.Constructor;

public class GetConstrctorDemo02 {
    public static void main(String[] args) {
        Class<?>c1=null;
        try {
            c1=Class.forName("Day1_19.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Constructor<?>con[]=c1.getConstructors();
        for(int i=0;i<con.length;i++){
            Class<?>p[]=con[i].getParameterTypes();
            System.out.print("构造方法：");
            System.out.print(con[i].getModifiers()+" ");
            System.out.print(con[i].getName());
            System.out.print("(");
            for(int j=0;j<p.length;j++){
                System.out.print(p[j].getName()+" arg"+i);
                if(j<p.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("){}");
        }
    }
}
