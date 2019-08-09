package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exception.UserAlreadyExitsException;

public interface UserService {
    public User saveUser(User user) throws UserAlreadyExitsException;

    public User getUserById(int id);

}
