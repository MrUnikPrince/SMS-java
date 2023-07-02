// public package SMS;
import java.sql.*;
class dbConnect{
    private static Connection mycon=null;
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        String db= "student_data";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/" + db;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
}
