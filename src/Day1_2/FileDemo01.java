package Day1_2;
import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) {
        File f=new File("d:\\test.txt");
        try{
            f.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
