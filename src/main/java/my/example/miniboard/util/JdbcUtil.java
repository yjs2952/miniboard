package my.example.miniboard.util;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {

    private static JdbcUtil getInstance = new JdbcUtil();
    private Connection conn;
    private String driver;
    private String url;
    private String user;
    private String pw;

    private JdbcUtil(){
        ClassLoader classLoader = null;
        Properties prop = null;
        URL resourceURl = null;

        try {
            classLoader = Thread.currentThread().getContextClassLoader();
            resourceURl = classLoader.getResource("DB/db.properties");
            prop = new Properties();
            prop.load(resourceURl.openStream());

            driver = prop.getProperty("JDBC.Driver");
            url = prop.getProperty("JDBC.ConnectionURL");
            user = prop.getProperty("JDBC.Username");
            pw = prop.getProperty("JDBC.Password");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    };

    public static JdbcUtil getInstance(){
        return getInstance;
    }

    public Connection getConnection() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pw);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void close(PreparedStatement ps) {
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

    public void close(PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(ps);
    }
}
