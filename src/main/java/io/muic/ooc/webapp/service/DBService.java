package io.muic.ooc.webapp.service;

import org.mindrot.jbcrypt.BCrypt;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    private final String jdbcDriverStr;
    private final String jdbcURL;

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public DBService() {
        this.jdbcDriverStr = "com.mysql.jdbc.Driver";
        this.jdbcURL = "jdbc:mysql://localhost:3306/ssc_webapp";
        try {
            Class.forName(jdbcDriverStr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(jdbcURL, "root", "Bismillah#1");
            statement = connection.createStatement();
            createTable();
        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void createTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute
                ("create table if not exists users (username varchar(255) not null, password varchar(255) not null,firstname varchar(255) not null, lastname varchar(255) not null, unique(username))");
        resultSet = statement.executeQuery("select * from users;");
        if (!resultSet.next()) {
            String password = "12345";
            String hashpw = BCrypt.hashpw(password, BCrypt.gensalt());
            statement.execute("insert into users values ('admin', '"+hashpw+"', 'admin', 'admin')");
        }
    }

    public boolean checkUser(String name){
        try {
            resultSet = statement.executeQuery("select * from users where username='"+name+"';");
            if(resultSet.next())
            {
                String user = resultSet.getString("username");
                if (user.equals(name)) {return true;}
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public String getPassword(String name){
        try {
            resultSet = statement.executeQuery("select * from users where username='"+name+"';");
            if(resultSet.next())
            {
                String pwd = resultSet.getString("password");
                System.out.println("pwd:" + pwd);
                return pwd;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void insertUser(String username, String password, String firstname, String lastname){
        try {
            preparedStatement = connection.prepareStatement("insert into users values (?,?,?,?)");
            preparedStatement.setString(1, username);
            String hashpw = BCrypt.hashpw(password, BCrypt.gensalt());
            preparedStatement.setString(2, hashpw);
            preparedStatement.setString(3, firstname);
            preparedStatement.setString(4, lastname);
            preparedStatement.execute();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public List<User> getUserList(){
        List<User> users = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(jdbcURL, "root", "Bismillah#1");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users;");
            while (resultSet.next()) {
                User user = new User(resultSet.getString(1), resultSet.getString(3), resultSet.getString(4));
                users.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    public User getUser(String username){
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users where username='"+username+"';");
           if (resultSet.next()){
                User res = new User(resultSet.getString(1), resultSet.getString(3), resultSet.getString(4));
                System.out.println(" from getUser" + res);
                return res;
            }
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return null;
    }

    public void delUser(String username){
        try {
            preparedStatement = connection.prepareStatement("delete from users where username='"+username+"';");
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updateUser(String username, String password, String firstname, String lastname){
        try {
            String hashpw = BCrypt.hashpw(password, BCrypt.gensalt());
            preparedStatement = connection.prepareStatement("update users set password='"+hashpw+"', firstname='"+firstname+"', lastname='"+lastname+"'  where username='"+username+"';");
            // preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
        }
    }
}
