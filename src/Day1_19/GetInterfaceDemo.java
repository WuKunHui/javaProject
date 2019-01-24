package Day1_19;

public class GetInterfaceDemo {
    public static void main(String[] args) {
        Class<?>c1=null;
        try {
            c1=Class.forName("Day1_19.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Class<?>c[]=c1.getInterfaces();
        for(int i=0;i<c.length;i++){
            System.out.println("实现的接口名称："+c[i].getName());
        }
    }
}
