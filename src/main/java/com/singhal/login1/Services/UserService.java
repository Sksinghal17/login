package com.singhal.login1.Services;

import com.singhal.login1.Repository.UserRepository;
import com.singhal.login1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUserEntry(User user)
    {
        userRepository.save(user);
    }

}
