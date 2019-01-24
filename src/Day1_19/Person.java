package Day1_19;

interface China{
    public static final String NATIONAL="China";
    public static final String AUTHOR="����";
    public void sayChina();
    public String sayHello(String name,int age);
}
public class Person implements China{
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public void sayChina(){
        System.out.println("���ߣ�"+AUTHOR+",������"+NATIONAL);
    }
    public String sayHello(String name,int age){
        return name+",��ã��ҽ��꣺"+age+"���ˣ�";
    }
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
        return "������"+this.name+";���䣺"+this.age;
    }
}
