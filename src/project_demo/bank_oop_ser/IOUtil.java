package week.project_demo.bank_oop_ser;

import java.io.*;
import java.util.ArrayList;

public class IOUtil {
    private FileOutputStream fos=null;
    private ObjectOutputStream oos=null;
    public void write(ArrayList<User> users)throws Exception{
        if(users!=null){
            File file=new File("e:/users.tmp");
            file.createNewFile();
            fos=new FileOutputStream(file);
            oos=new ObjectOutputStream(fos);
            oos.writeObject(users);
        }
    }

    public void closeWrite(){
        try {
            if(oos!=null){
                oos.close();
            }
            if(fos!=null){
                fos.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private FileInputStream fis=null;
    private ObjectInputStream ois=null;

    public ArrayList<User> read() throws Exception{
        ArrayList<User> users=new ArrayList<User>();
        File file=new File("e:/users.tmp");
        fis=new FileInputStream(file);
        ois=new ObjectInputStream(fis);
        users=(ArrayList<User>)ois.readObject();
        return users;
    }

    public void closeRead(){
        try {
            if(ois!=null){
                ois.close();
            }
            if(fis!=null){
                fis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}