import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {
    public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
    public static final String DBURL="jdbc:mysql://127.0.0.1:3306/test1";
    public static final String DBUSER="root";
    public static final String DBPASS="root";
    public static void main(String args[])throws Exception{
        Connection conn=null;
        Statement stmt=null;
        int id=2;
        Class.forName(DBDRIVER);
        String sql="DELETE FROM user WHERE id="+id;
        conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        stmt=conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }
}
