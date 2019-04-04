package com.quill.effective.chapter02.item01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by chenqg18662 on 2019/4/3.
 */
public class JdbcDemo {

    public static void main(String[] args) {
        Connection conn = getConn();
        String sql="CREATE TABLE `table_user` (\n" +
                "  `user_id` varchar(32) NOT NULL,\n" +
                "  `mobile_no` varchar(20) DEFAULT NULL,\n" +
                "  `nick` varchar(20) DEFAULT NULL,\n" +
                "  `sex` varchar(1) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`user_id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/local";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


}
