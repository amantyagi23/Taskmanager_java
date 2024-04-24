package src.controller;

import java.util.ArrayList;

import src.model.User;

public class UserOperation {

    private ArrayList<User> userList = new ArrayList<User>();

    public boolean CreateUser(String name, String email, String password) {
        // validations check email,password,name
        User user = new User(name, email, password);
        userList.add(user);
        return true;
    }

    public boolean login(String email, String password) {
        return true;
    }

    public User getUserDetailsByEmail(String email) {
        return null;
    }

    public boolean updateUserName(String email) {
        return false;
    }

    private User getUserByEmail(String email) {
        return null;
    }

}
