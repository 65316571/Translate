package JDBC;

import java.sql.*;

/**
 * @author hao
 * JDBC工具类
 */
public class Tool {
    public static Connection getConn() throws Exception {
        //1.建立连接对象方法
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vocabulary", "root", "123456");
        return conn;
    }

    public static void release(Connection conn, Statement st) {
        //2.释放资源方法:增删改
        if (st != null) {
            //先关闭预操作对象
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            //再关闭连接对象
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void release(Connection conn, Statement st, ResultSet rs) {
        //2.实现方法重载 释放资源方法:查询
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            release(conn, st);
            //关闭conn,ps的资源
        }
    }
}
