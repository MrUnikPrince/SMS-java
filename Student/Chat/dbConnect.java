package Chat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 class dbConnect {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sms";
    private static final String USER = "root";
    private static final String PASS = "root";

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}

