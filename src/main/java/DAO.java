import java.sql.SQLException;

public interface DAO<Entity> {
    Entity read(int id) throws SQLException;

}
