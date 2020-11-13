package org.example;

import java.sql.*;

public class Test {

    private static final String HOST_URL = "jdbc:postgresql://localhost:5432/moodle";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "dbp2020wesh";
    private static final String INSERT_NEW = "INSERT INTO infodesk VALUES(?,?,?,?,?)";
    private static final String GET_ALL = "SELECT * FROM infodesk";


    public static void main(String[] args) {

        Connection connection;
        PreparedStatement preparedStatement;

        try {
            connection = DriverManager.getConnection(HOST_URL, USERNAME, PASSWORD);
            //preparedStatement = connection.prepareStatement(INSERT_NEW);
            preparedStatement = connection.prepareStatement(GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                int id = resultSet.getInt(1);
                String first_Name = resultSet.getString(2);
                String last_Name = resultSet.getString(3);
                double average_Grade = resultSet.getDouble(4);
                String sex = resultSet.getString(5);

                System.out.println("Id: " + id +
                        ", first name: " + first_Name +
                        ", last name: " + last_Name +
                        ", average grade: " + average_Grade +
                        ", sex: " + sex);
            }

//           preparedStatement.setInt(1,2);
//           preparedStatement.setString(2,"Argisht");
//           preparedStatement.setString(3,"Tigranyan");
//           preparedStatement.setDouble(4,23.33);
//           preparedStatement.setString(5,"Male");

           preparedStatement.execute();

           connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
