import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private final static String dbURL = "jdbc:mysql://localhost:3306/MyDB";
    private final static String username = "root";
    private final static String password = "pass";
    protected java.sql.Connection conn;

    public Connection() {
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected");
            }
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }
    }

}
