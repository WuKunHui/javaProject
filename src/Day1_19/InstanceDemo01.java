package Day1_19;
public class InstanceDemo01 {
    public static void main(String[] args) {
        Class<?>c=null;
        try {
            c=Class.forName("Day1_19.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person per=null;
        try {
            per=(Person)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        per.setName("уесб");
        per.setAge(30);
        System.out.println(per);
    }
}
