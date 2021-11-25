import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application extends Connection {

    public static void main(String[] args) throws FileNotFoundException, SQLException {
        Connection connection = new Connection();

        ScriptRunner sr = new ScriptRunner(connection.conn);

        sr.runScript(new FileReader("D:\\old\\myProject\\src\\main\\resources\\create_table_and_insert.sql"));


        TourDao tourDao = new TourDao();
        Tour tour = tourDao.read(1);

        System.out.println(tour.getName());

    }


}
