package com.hkdemircan.demo.service;

import com.hkdemircan.demo.model.User;

import java.util.List;

public interface UserService {

     User save(User user);
     List<User> findAll();
     User findFirstById(Long id);
     void delete(User user);
}
