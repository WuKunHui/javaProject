package Day1_19;

public class GetSuperClassDemo {
    public static void main(String[] args) {
        Class<?>c1=null;
        try {
            c1=Class.forName("Day1_19.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Class<?>c2=c1.getSuperclass();
        System.out.println("∏∏¿‡√˚≥∆£∫"+c2.getName());
    }
}
