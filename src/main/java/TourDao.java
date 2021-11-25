import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TourDao implements DAO<Tour> {


    String query = "select * from tour";

    public Tour read(int id) throws SQLException {
        Connection connection = new Connection();

        Statement statement = connection.conn.createStatement();


        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();
        String tour = resultSet.getString("name");


        return new Tour(tour);
    }
}
