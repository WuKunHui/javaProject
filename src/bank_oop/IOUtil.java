package bank_oop;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
public class IOUtil {
    private OutputStreamWriter osw=null;
    private BufferedWriter bw=null;


    public void write(ArrayList<User> users)throws Exception{
        if(users!=null){
            StringBuffer sb=new StringBuffer();
            for(User u:users){
                sb.append(u.getName()+" "+u.getPwd()+" "+u.getMoney()+"\n");
            }
            File file=new File("e:"+File.separator+"users.txt");
            file.createNewFile();
            osw=new OutputStreamWriter(new FileOutputStream(file));
            bw=new BufferedWriter(osw);
            bw.write(sb.toString());
        }
    }

    public void closeWrite(){
        try {
            if(bw!=null){
                bw.close();
            }
            if(osw!=null){
                osw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private InputStreamReader isr=null;
    private BufferedReader br=null;

    public ArrayList<User> read() throws Exception{
        ArrayList<User> users=new ArrayList<User>();
        File file=new File("e:"+File.separator+"users.txt");
        InputStreamReader isr=new InputStreamReader(new FileInputStream(file));
        BufferedReader br=new BufferedReader(isr);
        String s="";
        while((s=br.readLine())!=null){
            String[] strs=s.split(" ");
            User u=new User();
            u.setName(strs[0]);
            u.setPwd(strs[1]);
            u.setMoney(new BigDecimal(strs[2]));
            users.add(u);
        }
        return users;
    }

    public void closeRead(){
        try {
            if(br!=null){
                br.close();
            }
            if(isr!=null){
                isr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}