package Day12_8;
class Student{
    String name;
    int age;
    int id;
    String classmate;
    String address;
    long phone;
    public void introduce(){
        System.out.println("����:"+name+"\t"+"���䣺"+age);
    }
    public void speak(){
        System.out.println("�༶�ǣ�"+classmate+"\t"+"ѧ���ǣ�"+id);
    }
    public void register(){
        System.out.println("��ͥסַ�ǣ�"+address+"\t"+"�绰�ǣ�"+phone);
    }
}
public class ClassStudents {
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();
        Student st3=new Student();
        st1.name="����";
        st1.age=20;
        st2.classmate="����11605��";
        st2.id=201600001;
        st3.address="�����Ƹ�";
        st3.phone=12345678910L;
        System.out.println("st1�еĶ������ݣ�");
        st1.introduce();
        System.out.println("st2�еĶ������ݣ�");
        st2.speak();
        System.out.println("st3�еĶ������ݣ�");
        st3.register();
    }

}
