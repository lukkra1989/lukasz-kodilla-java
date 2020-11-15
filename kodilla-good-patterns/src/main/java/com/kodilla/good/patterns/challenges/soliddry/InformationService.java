package com.kodilla.good.patterns.challenges.soliddry;

public interface InformationService {
    void inform(User user, Item item);

    void informAboutOrder(User user, String name, int quantity);
}
