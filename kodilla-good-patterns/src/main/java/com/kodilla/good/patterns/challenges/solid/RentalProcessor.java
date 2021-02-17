//package com.kodilla.good.patterns.challenges.solid;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class RentalProcessor {
//
//
//    //RentRequest rentRequest = new RentRequest("John", to,from);
//    private InformationService informationService;
//    private  RentalService rentalService;
//    private RentalRepository rentalRepository;
//
//    public RentalProcessor(final MailService informationService,
//                           final RentalService rentalService,
//                           final RentalRepository rentalRepository) {
//        this.informationService = (InformationService) informationService;
//        this.rentalService = rentalService;
//        this.rentalRepository = rentalRepository;
//    }
//
//    public RentalProcessor(MailService informationService, CarRentalService carRentalService, CarRentalRepository rentalRepository) {
//
//    }
//
//    public RentalDto process(final RentRequest rentRequest){
//        boolean isRented = rentalService.rent(rentRequest.getUser(),rentRequest.getFrom(), rentRequest.getTo());
//        if(isRented){
//            informationService.inform(rentRequest.getUser());
//            rentalRepository.createRental(rentRequest.getUser(),rentRequest.getFrom(),rentRequest.getTo());
//            return  new RentalDto(rentRequest.getUser(), true);
//        }else {
//            return  new RentalDto(rentRequest.getUser(), false);
//        }
//    }
//}
//
//
//
