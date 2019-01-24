import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo02 {
    public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
    public static final String DBURL="jdbc:mysql://127.0.0.1:3306/test1";
    public static final String DBUSER="root";
    public static final String DBPASS="root";

    public static void main(String[] args) {
        Connection conn=null;
        try {
            Class.forName(DBDRIVER);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(conn);
        try {
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
