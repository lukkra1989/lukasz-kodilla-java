package com.kodilla.good.patterns.challenges.soliddry;

public class MailService implements InformationService {
    @Override
    public void inform(User user, Item item) {
        System.out.println("Welcome in our shop" + user.getName() + "!");
        System.out.println("In Your basket there is/are: " + item.getName() +
                " wchich value is: " + item.getPrice());
    }

    @Override
    public void informAboutOrder(User user, String name, int quantity) {
        System.out.println("We created new order for: " + user.getName() + "products: " + name + "in amount of: " + quantity);
    }
}
