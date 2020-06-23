package com.potato.service;

import com.potato.po.User;

public interface UserService {

    User checkUser(String username,String password);
}
