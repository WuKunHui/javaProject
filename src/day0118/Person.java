package day0118;

import java.io.Serializable ;
public class Person implements Serializable{
	public static final long serialVersionUID = -3726979342461807520L;
	private String name ;	// 声明name属性，但是此属性不被序列化
	private int age ;		// 声明age属性
	public Person(String name){
		this.name=name;
	}
	public Person(String name,int age){	// 通过构造设置内容
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

	public String toString(){	// 覆写toString()方法
		return "姓名：" + this.name + "；年龄：" + this.age ;
	}
};


