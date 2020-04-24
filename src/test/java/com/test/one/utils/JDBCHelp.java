package com.test.one.utils;

import java.sql.*;


public class JDBCHelp {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://172.16.10.138:3307/101credit_app";
    private static Connection connection;
    private JDBCHelp jdbcHelp;

    private  JDBCHelp() {
        if (jdbcHelp == null) {
            jdbcHelp = new JDBCHelp();
        }
    }

    public static Connection getConn() {

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, "credit_rw", "credit");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void CloseConn(Connection conn) throws SQLException {

//        if (resultSet != null) {
//            try {
//                resultSet.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
//        if (statement != null) {
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }




    }

}
