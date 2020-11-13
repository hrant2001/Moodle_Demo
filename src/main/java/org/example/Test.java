package org.example;

import java.sql.*;

public class Test {

    private static final String HOST_URL = "jdbc:postgresql://localhost:5432/moodle";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "dbp2020wesh";
    private static final String INSERT_NEW = "INSERT INTO infodesk VALUES(?,?,?,?,?)";
    private static final String GET_ALL = "SELECT * FROM infodesk";


    public static void main(String[] args) {

        Student hrant = new Student(1, "Hrant",
                "Arakelyan", 17.99,"Male");

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
                        ", First Name: " + first_Name
                        + ", Last Name: " + last_Name +
                        ", Average: " + average_Grade +
                        ", Sex: " + sex);
            }

//           preparedStatement.setInt(1,hrant.getId());
//           preparedStatement.setString(2, hrant.getFirstName());
//           preparedStatement.setString(3, hrant.getLastName());
//           preparedStatement.setDouble(4,hrant.getAverageYearGrade());
//           preparedStatement.setString(5, hrant.getSex());

           preparedStatement.execute();

           connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
