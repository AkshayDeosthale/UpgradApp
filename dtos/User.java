package com.upgrad.ublog.dtos;

/**
 * TODO: 1.8. Declare 3 private instance variables in this class named as
 *  userId, emailId and password. Out of these 3 variables, userId will be of
 *  type int. Other two variables will be of type String.
 *
 * TODO: 1.9. Provide getters and setters for each of the instance variables. Also,
 *  provide a no-arg constructor and a parameterized constructor to create objects
 *  of User class.
 *
 * Note: Uncomment the toString() method given below, instead of writing a new one.
 */

public class User {

    private int userId;
    private String emailId;
    private String password;

    User(int userId,String emailId,String password) {
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
    }

    User(){}

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // For UserID==============================================
    public int getUserId(){
        return userId;
    }
    public void setUserId(int a){
        userId=a;
    }

    // For EmailID =================================================
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String a) {
        emailId=a;
    }

    // For Password=======================================================
    public String getPassword(){
        return password;
    }
    public void setPassword(String a){
        password=a;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUserId(1);
        user.setEmailId("dummy@dummy.com");
        user.setPassword("password");

        System.out.println(user);

        /**
//         * Your output should be similar to this.
//         * User{userId=1, emailId='dummy@dummy.com', password='password'}
//         */
    }
}
