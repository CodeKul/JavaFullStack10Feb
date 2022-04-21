package jdbc;

import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");//register driver
        Connection connection =                            // establishing connection
                DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb", "root3", "password");

        CallableStatement callableStatement = connection.prepareCall("call getStudentData()");

        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1)
                    + " " + resultSet.getString(2)+" "+resultSet.getString(3));
        }

    }
}
