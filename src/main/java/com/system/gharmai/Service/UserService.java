package com.system.gharmai.Service;

import com.system.gharmai.Pojo.UserPojo;
import com.system.gharmai.entity.User;
import com.system.gharmai.Pojo.UserPojo;

import java.util.List;

public interface UserService {

    String saveUser(UserPojo userPojo);
    List<User> fetchAll();
    User findByEmail(String email);
    User fetchbyId(Integer id);

    void deleteById(Integer id);

//    void deleteUser(int userId);
//
//    void deleteById(Integer id);

//
//    void deleteById(Integer id);
}