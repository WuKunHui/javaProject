package day0118_1;

import java.io.*;

public class UtilIo {
    private String mFileName;
    public void SetFileName(String fileName){
        this.mFileName = fileName;
    }
    public void Write(Person mData) throws Exception{
        File f = new File("D:" + File.separator + this.mFileName) ;	// ���屣��·��
        ObjectOutputStream oos = null ;	// �������������
        OutputStream out = new FileOutputStream(f) ;	// �ļ������
        oos = new ObjectOutputStream(out) ;
        oos.writeObject(mData) ;	// �������
        oos.close() ;	// �ر�
    }
    public Person Reader()throws Exception{
        File f = new File("D:" + File.separator + this.mFileName) ;	// ���屣��·��
        ObjectInputStream ois = null ;	// ��������������
        InputStream input = new FileInputStream(f) ;	// �ļ�������
        ois = new ObjectInputStream(input) ;	// ʵ��������������
        Object obj = ois.readObject() ;	// ��ȡ����
        ois.close() ;	// �ر�
        return (Person)obj;
    }
}
