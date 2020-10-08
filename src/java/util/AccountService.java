/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import model.User;

/**
 *
 * @author 839645
 */
public class AccountService {
    String username;
    String password;

    public AccountService(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    public User login(String username, String password){
        if( (username.equals("adam") || username.equals("betty")) && password.equals("password")){
            return new User(username,null);
        } else {
            return null;
        }
    }
}
