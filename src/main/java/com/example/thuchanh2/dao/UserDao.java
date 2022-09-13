package com.example.thuchanh2.dao;

import com.example.thuchanh2.model.Login;
import com.example.thuchanh2.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> users;
    static {
        users = new ArrayList<User>();
        User u1=new User();
        u1.setAge(10);
        u1.setName("Dĩnh");
        u1.setAccount("Dinh");
        u1.setEmail("dinh@gmail.com");
        u1.setPassword("vinhquang");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Trong");
        u2.setAccount("Trong");
        u2.setEmail("trong@gmail.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Hiếu");
        u3.setAccount("hieu");
        u2.setEmail("hieu@gmail.com");
        u3.setPassword("123456");
        users.add(u3);

    }
    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
