package day0118;

import java.io.Serializable ;
public class Person implements Serializable{
	public static final long serialVersionUID = -3726979342461807520L;
	private String name ;	// ����name���ԣ����Ǵ����Բ������л�
	private int age ;		// ����age����
	public Person(String name){
		this.name=name;
	}
	public Person(String name,int age){	// ͨ��������������
		this(name);
		this.age = age ;
	}
	public void setName(String name){
		this.name=name;
	}
	public void SetAge(int nAge){
		this.age = nAge;
	}
	public String GetName(){
		return this.name;
	}

	public String toString(){	// ��дtoString()����
		return "������" + this.name + "�����䣺" + this.age ;
	}
};


