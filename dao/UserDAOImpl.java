//How to give variable input in sql query in java.
//UserDAO cannot be inherited.

package com.upgrad.ublog.dao;
import com.upgrad.ublog.dtos.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * TODO: 3.5. Implement the UserDAO interface and implement this class using the Singleton pattern.
 *  (Hint: Should have a private no-arg Constructor, a private static instance attribute of type
 *  UserDAOImpl and a public static getInstance() method which returns the instance attribute.)
 * TODO: 3.6. findByEmailId() method should take email id as an input parameter and
 *  return the user details corresponding to the email id from the USER table defined
 *  in the database. (Hint: You should get the connection using the Database class)
 * TODO: 3.7. create() method should take user details as input and insert these details
 *  into the USER table. Return the same User object which was passed as an input
 *  argument. (Hint: You should get the connection using the Database class)
 */

public class UserDAOImpl implements UserDAO{

    private UserDAOImpl(){}
    private static UserDAOImpl instance;

    public static UserDAOImpl getInstance() {
        if (instance == null) {
            instance = new UserDAOImpl();
        }
        return instance;
    }

    public void findByEmailId(String a) throws SQLException {

        Connection connection = com.upgrad.ublog.db.Database.getConnection();
        Statement statement = connection.createStatement();
        String selectQuery = "SELECT * FROM user where emailID='temp@temp.temp';";

        System.out.println(statement.executeQuery(selectQuery));
    }

    public void create(User a) throws SQLException {
        Connection connection = com.upgrad.ublog.db.Database.getConnection();
        Statement statement = connection.createStatement();
        String selectQuery = "INSERT INTO user (userId, emailId, password) VALUES (11,'temp@temp.temp', 'temp');";

        System.out.println(statement.executeUpdate(selectQuery));
    }

    public static void main(String[] args) {
        try {
            UserDAO userDAO = new UserDAOImpl();
            User temp = new User();
            temp.setUserId(1);
            temp.setEmailId("temp@temp.temp");
            temp.setPassword("temp");
            userDAO.create(temp);
            userDAO.findByEmailId("temp@temp.temp");
        } catch (Exception e) {
            System.out.println("FAILED");
        }

        /**
//         * Following should be the desired output of the main method.
//         * User{userId=11, emailId='temp@temp.temp', password='temp'}
//         */
    }
}
