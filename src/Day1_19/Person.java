package Day1_19;

interface China{
    public static final String NATIONAL="China";
    public static final String AUTHOR="张勇";
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
        System.out.println("作者："+AUTHOR+",国籍："+NATIONAL);
    }
    public String sayHello(String name,int age){
        return name+",你好！我今年："+age+"岁了！";
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
        return "姓名："+this.name+";年龄："+this.age;
    }
}
