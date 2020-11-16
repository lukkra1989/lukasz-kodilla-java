package com.kodilla.good.patterns.challenges.soliddry;

public class OrderDto {
    private User user;
    private boolean isSold;

    public void OrderDto(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
