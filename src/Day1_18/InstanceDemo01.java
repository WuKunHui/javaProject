package Day1_18;

class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return "–’√˚£∫"+this.name+";ƒÍ¡‰£∫"+this.age;
    }
}
public class InstanceDemo01 {
    public static void main(String[] args) {
        Class<?>c=null;
        try {
            c=Class.forName("src.Day11_17.DataDemo04.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person per=null;
        try {
            per=(Person)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        per.setName("’≈”¬");
        per.setAge(30);
        System.out.println(per);
    }
}
