package NtoN;

import java.util.Iterator;

public class TestMore {
    public static void main(String args[]) {
        NtoN.Course c1 = new NtoN.Course("Ӣ��", 3);    // ��һ�ſγ�
        NtoN.Course c2 = new NtoN.Course("�����", 5);    // �ڶ��ſγ�
        Student s1 = new Student("����", 20);
        Student s2 = new Student("����", 21);
        Student s3 = new Student("����", 22);
        Student s4 = new Student("����", 23);
        Student s5 = new Student("����", 24);
        Student s6 = new Student("Ǯ��", 24);
        // ��һ�ſγ�������ѧ���μ�
        c1.getAllStudents().add(s1);
        c1.getAllStudents().add(s2);
        c1.getAllStudents().add(s6);
        s1.getAllCourses().add(c1);
        s2.getAllCourses().add(c1);
        s6.getAllCourses().add(c1);
        // �ڶ��ſγ�������ѧ���μ�
        c2.getAllStudents().add(s1);
        c2.getAllStudents().add(s2);
        c2.getAllStudents().add(s3);
        c2.getAllStudents().add(s4);
        c2.getAllStudents().add(s5);
        c2.getAllStudents().add(s6);
        s1.getAllCourses().add(c2);
        s2.getAllCourses().add(c2);
        s3.getAllCourses().add(c2);
        s4.getAllCourses().add(c2);
        s5.getAllCourses().add(c2);
        s6.getAllCourses().add(c2);
        // ���һ�ſγ̵���Ϣ���۲�һ�ſγ��ж��ٸ�ѧ���μ�\
        System.out.println(c1);
        Iterator<Student> iter1 = c1.getAllStudents().iterator();
        while (iter1.hasNext()) {
            Student s = iter1.next();
            s.setAge(40);
            /*if (s.equals("")) {
                c1.getAllStudents().remove(s);
            }//ctrl+shift+alt+L ��ʽ������
*/
            System.out.println("\t|- " + s);
        }
        System.out.println(c2);
        iter1 = c2.getAllStudents().iterator();
        while (iter1.hasNext()) {
            Student s = iter1.next();
            if (s.equals("����")) {
                c2.getAllStudents().remove(s);
            }//ctrl+shift+alt+L ��ʽ������
            System.out.println("\t|- " + s);
        }
        // ͨ��ѧ���ҵ�ѧ���μӵĿγ�
        System.out.println(s6);
        Iterator<NtoN.Course> iter2 = s6.getAllCourses().iterator();
        while (iter2.hasNext()) {
            NtoN.Course c = iter2.next();
            System.out.println("\t|- " + c);
        }
    }
};