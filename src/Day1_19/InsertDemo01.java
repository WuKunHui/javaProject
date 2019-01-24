import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo01 {
    public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
    public static final String DBURL="jdbc:mysql://127.0.0.1:3306/test1";
    public static final String DBUSER="root";
    public static final String DBPASS="root";
    public static void main(String args[])throws Exception{
        Connection conn=null;
        Statement stmt=null;
        Class.forName(DBDRIVER);
        String sql="INSERT INTO user(name,password,age,sex,birthday)"+
                "VALUES('ÕÅÓÂ','www.Yjsj.cn',36,'ÄÐ','2018-08-27')";
        conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        stmt=conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }
}
