package my.example.miniboard.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {

    public static Connection connection() {

        Properties prop = new Properties();
        String driver = null;
        String url = null;
        String user = null;
        String pw = null;

        try {
            Reader reader = new FileReader("C:\\STUDY\\IntelliJ_Projects\\miniboard\\src\\main\\resources\\DB\\db.properties");
            prop.load(reader);

            driver = prop.getProperty("JDBC.Driver");
            url = prop.getProperty("JDBC.ConnectionURL");
            user = prop.getProperty("JDBC.Username");
            pw = prop.getProperty("JDBC.Password");

        } catch (IOException ie) {
            ie.printStackTrace();
        }

        return connection(driver, url, user, pw);
    }

    public static Connection connection(String driver, String url, String dbId, String dbPassword) {

        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, dbId, dbPassword);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn, ps);
    }
}
