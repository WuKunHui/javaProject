package Day1_19;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethodDemo {
    public static void main(String[] args) {
        Class<?>c1=null;
        try {
            c1=Class.forName("Day1_19.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Method m[]=c1.getMethods();
        for(int i=0;i<m.length;i++){
            Class<?>r=m[i].getReturnType();
            Class<?>p[]=m[i].getParameterTypes();
            int xx=m[i].getModifiers();
            System.out.print(Modifier.toString(xx)+" ");
            System.out.print(r+"");
            System.out.print(m[i].getName());
            System.out.print("(");
            for(int j=0;j<p.length;j++){
                System.out.print(p[j].getName()+" "+"arg"+j);
                if(j<p.length-1){
                    System.out.print(",");
                }
            }
            Class<?>ex[]=m[i].getExceptionTypes();
            if(ex.length>0){
                System.out.print(") throws");
            }else {
                System.out.print(")");
            }
            for(int j=0;j<ex.length;j++){
                System.out.print(ex[j].getName());
                if(j<p.length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
