import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class create_DB {
    static final String DB_URL = "jdbc:postresql://34.132.228.8:5432/sonar";
    static final String USER = "postgres";
    static final String PASS = "qwerty1234";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = connection.createStatement();) {
            String sql = "Create database VRD";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
