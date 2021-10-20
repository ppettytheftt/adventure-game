import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCAreaDAO {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "postGres1";
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
