package day0118_1;

import java.io.*;

public class UtilIo {
    private String mFileName;
    public void SetFileName(String fileName){
        this.mFileName = fileName;
    }
    public void Write(Person mData) throws Exception{
        File f = new File("D:" + File.separator + this.mFileName) ;	// 定义保存路径
        ObjectOutputStream oos = null ;	// 声明对象输出流
        OutputStream out = new FileOutputStream(f) ;	// 文件输出流
        oos = new ObjectOutputStream(out) ;
        oos.writeObject(mData) ;	// 保存对象
        oos.close() ;	// 关闭
    }
    public Person Reader()throws Exception{
        File f = new File("D:" + File.separator + this.mFileName) ;	// 定义保存路径
        ObjectInputStream ois = null ;	// 声明对象输入流
        InputStream input = new FileInputStream(f) ;	// 文件输入流
        ois = new ObjectInputStream(input) ;	// 实例化对象输入流
        Object obj = ois.readObject() ;	// 读取对象
        ois.close() ;	// 关闭
        return (Person)obj;
    }
}
