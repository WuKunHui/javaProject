package Day12_19;
class Person01{
    void print(){
        System.out.println("Person01-->void print()");
    }
}
class Student01 extends Person01{
    public void print(){
        super.print();
        System.out.println("Student01-->void print()");
    }
}
public class OverideDemo01 {
    public static void main(String[] args) {
        Student01 stu=new Student01();
        stu.print();
    }
}
