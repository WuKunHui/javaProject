import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo02 {
    public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
    public static final String DBURL="jdbc:mysql://127.0.0.1:3306/test1";
    public static final String DBUSER="root";
    public static final String DBPASS="root";
    public static void main(String args[])throws Exception{
        Connection conn=null;
        Statement stmt=null;
        String name="¿Óœ…";
        String password="www.Yjsjjava.cn";
        int age=23;
        String sex="≈Æ";
        String birthday="2003-08-27";
        String sql="INSERT INTO user(name,password,age,sex,birthday)"+
                "VALUES ('"+name+"','"+password+"',"+age+",'"+sex+"','"+birthday+"')";
        conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        stmt=conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }
}
