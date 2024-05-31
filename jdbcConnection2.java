package org.example;

import java.sql.*;
import java.util.Scanner;

public class jdbcConnection2 {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";
        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/svv", "root", "root");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter student ID (or type 'exit' to quit): ");
            String id = scanner.nextLine().trim();
            if (id.equalsIgnoreCase("exit")) {
                break;
            }
            if (isStudentIDExists(con, id)) {
                System.out.println("Student ID found. Please enter the student's name:");
                String name = scanner.nextLine().trim();
                System.out.println("Enter student's email address:");
                String email = scanner.nextLine().trim();
                System.out.println("Enter student's date of birth (yyyy-mm-dd):");
                String dob = scanner.nextLine().trim();
                updateStudentInfo(con, id, name, email, dob);
                System.out.println("Student information updated successfully.");
            } else {
                System.out.println("Student ID not found.");
            }
        }
        con.close();
        scanner.close();
    }
    private static boolean isStudentIDExists(Connection con, String id) throws SQLException {
        String query = "SELECT COUNT(*) FROM student WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, id);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        statement.close();
        return count > 0;
    }
    private static void updateStudentInfo(Connection con, String id, String name, String email, String dob) throws SQLException {
        String updateSQL = "UPDATE student SET name = ?, email = ?, dob = ? WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(updateSQL);
        statement.setString(1, name); statement.setString(2, email);
        statement.setString(3, dob); statement.setString(4, id); statement.executeUpdate(); statement.close();
    }

}
