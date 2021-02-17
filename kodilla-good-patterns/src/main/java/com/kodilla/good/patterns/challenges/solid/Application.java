//package com.kodilla.good.patterns.challenges.solid;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class Application {
//
//    public static void main(String[] args) {
//            RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
//            RentRequest rentRequest = rentRequestRetriever.retrieve();
////        User user = new User("John", "Wekl");
////
////        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
////        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);
//
//        RentalProcessor rentalProcessor = new RentalProcessor(
//                new MailService(), new CarRentalService(), new CarRentalRepository());
//        rentalProcessor.process(rentRequest);
//    }
//}
//
//
//
//
//
//
//
////          CarRentalService carRentalService = CarRentalService();
////          boolean isRented = carRentalService.rent(user, rentFrom, rentTo);
////
////          MailService mailService = new MailService();
////          CarRentalRepository carRentalRepository = new CarRentalRepository();
////
////          if(isRented){
////              mailService.sendEmail(user);
////              carRentalRepository.createCarRental(user, rentFrom, rentTo);
////          }else{
////              System.out.println("Car ret has been rejected!");
////          }