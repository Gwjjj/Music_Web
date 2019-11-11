package cn.gwjjj.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class ConnectionUtils {
    private ThreadLocal<Connection> t1 = new ThreadLocal<>();
    @Autowired
    private DataSource dataSource;

    public Connection getConnection() {
        Connection connection = t1.get();
        try {
            if (connection == null){
                connection = dataSource.getConnection();
                t1.set(connection);
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
    public void remove(){
        t1.remove();
    }
}
