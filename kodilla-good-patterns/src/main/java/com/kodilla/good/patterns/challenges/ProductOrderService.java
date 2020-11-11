package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.solid.RentalDto;

//1
public class ProductOrderService {

    private final UserRepository userRepository;
    private final UserRepositoryImpl userRepositoryImpl;
    private final UserService userService;
    private final ProductService productService;


    public ProductOrderService(final UserRepository userRepository,
                               UserRepositoryImpl userRepositoryImpl, UserService userService,
                               ProductService productService) {
        this.userRepository= userRepository;
        this.userRepositoryImpl = userRepositoryImpl;
        this.userService = userService;
        this.productService = productService;
    }
    public RentalDto process(final OrderRequest orderRequest){
        boolean isOrdered=userRepositoryImpl.findById(userRepository.findById(8000000000000000L ) );
    }
}
