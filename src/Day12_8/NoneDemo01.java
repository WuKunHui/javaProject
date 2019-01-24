package Day12_8;
class Person{
    private String name;
    private int age;
    public Person(){
    }
    public Person(String n){
        this.setName(n);
    }
    public Person(String n,int a){
        this.setName(n);
        this.setAge(a);
    }
    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        if(a>0&&a<150){
            age=a;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void tell(){
        System.out.println("姓名："+this.getName()+"，性别："+this.getAge());
    }
}
public class NoneDemo01 {
    public static void main(String[] args) {
        new Person("张三",30).tell();
    }
}
