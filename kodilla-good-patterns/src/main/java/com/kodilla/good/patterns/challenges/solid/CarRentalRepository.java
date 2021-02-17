package com.kodilla.good.patterns.challenges.solid;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    public void createCarRental() {

    }

    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
