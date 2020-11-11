package com.kodilla.good.patterns.challenges;
//1
public class ProductOrderService {

    private final UserRepository userRepository;
    private final UserService userService;


    public ProductOrderService(final UserRepository userRepository,UserService userService) {
        this.userRepository= userRepository;
        this.userService = userService;
    }
}
