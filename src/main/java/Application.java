import Gamelogic.GameLogic;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        try {
            JDBCAreaDAO.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        GameLogic.startGame();
    }
}
