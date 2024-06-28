package com.example.est_spring;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepositoryInterface userRepository;
    //private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
