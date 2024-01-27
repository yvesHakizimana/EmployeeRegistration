package com.code.empregistration.employeeregistration.dao;

import com.code.empregistration.employeeregistration.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
    public int registerEmployee(Employee employee) throws ClassNotFoundException{
        String INSERT_USERS_SQL = "INSERT INTO  employee " + " (first_name , last_name , username, password , address, contact) VALUES   " + " (?, ? , ? , ? , ?, ?)" ;
        int result = 0;

        Class.forName("org.postgresql.Driver");

        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webapp")){
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getUsername());
            preparedStatement.setString(4, employee.getUsername());
            preparedStatement.setString(5, employee.getAddress());
            preparedStatement.setString(6, employee.getContact());

            // Execute the statement
            result = preparedStatement.executeUpdate();

        } catch(SQLException ex){
            printSQlException(ex);
        }
        return result;

    }

    private void printSQlException(SQLException ex){
        for(Throwable e : ex)
            if(e instanceof  SQLException){
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("ErrorCode: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + ((SQLException) e).getMessage());
                Throwable cause = ex.getCause();
                while(cause != null)
                {
                    System.out.println("cause : " + cause);
                    cause = cause.getCause();
                }
            }
    }
}
