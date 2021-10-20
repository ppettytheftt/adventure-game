import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCAreaDAO {

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
