package Day12_8;
class Student{
    String name;
    int age;
    int id;
    String classmate;
    String address;
    long phone;
    public void introduce(){
        System.out.println("姓名:"+name+"\t"+"年龄："+age);
    }
    public void speak(){
        System.out.println("班级是："+classmate+"\t"+"学号是："+id);
    }
    public void register(){
        System.out.println("家庭住址是："+address+"\t"+"电话是："+phone);
    }
}
public class ClassStudents {
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();
        Student st3=new Student();
        st1.name="张三";
        st1.age=20;
        st2.classmate="金融11605班";
        st2.id=201600001;
        st3.address="湖北黄冈";
        st3.phone=12345678910L;
        System.out.println("st1中的对象内容：");
        st1.introduce();
        System.out.println("st2中的对象内容：");
        st2.speak();
        System.out.println("st3中的对象内容：");
        st3.register();
    }

}
