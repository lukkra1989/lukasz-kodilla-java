package com.kodilla.good.patterns.challenges.soliddry;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getById(){
        return userRepository.findById(getById());
    }
}
