package Day1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

class InputData{
    private BufferedReader buf=null;
    public InputData(){
        this.buf=new BufferedReader(new InputStreamReader(System.in));
    }
    public String getString(String info){
        String temp=null;
        System.out.print(info);
        try {
            temp=this.buf.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return temp;
    }
    public int getInt(String info,String err){
        int temp=0;
        String str=null;
        boolean flag=true;
        while (flag){
            str=this.getString(info);
            if(str.matches("^\\d+$")){
                temp=Integer.parseInt(str);
                flag=false;
            }else {
                System.out.println(err);
            }
        }
        return temp;
    }
    public float getFloat(String info,String err){
        float temp=0;
        String str=null;
        boolean flag=true;
        while (flag){
            str=this.getString(info);
            if(str.matches("^\\d+.?\\d+$")){
                temp=Float.parseFloat(str);
                flag=false;
            }else {
                System.out.println(err);
            }
        }
        return temp;
    }
    public Date getDate(String info,String err){
        Date temp=null;
        String str=null;
        boolean flag=true;
        while (flag){
            str=this.getString(info);
            if(str.matches("^\\d{4}-\\d{2}-\\d{2}$")){
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                try {
                    temp=sdf.parse(str);
                }catch (Exception e){ }
                flag=false;
            }else {
                System.out.println(err);
            }
        }
        return temp;
    }
}
public class ExecDemo02 {
    public static void main(String[] args) throws Exception{
        int i=0;
        int j=0;
        InputData input=new InputData();
        i=input.getInt("请输入第一个数字：","输入的数据必须是数字，请重新输入！");
        j=input.getInt("请输入第二个数字：","输入的数据必须是数字，请重新输入！");
        System.out.println(i+"+"+j+"="+(i+j));
    }
}
