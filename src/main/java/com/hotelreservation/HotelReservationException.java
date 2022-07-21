package com.hotelreservation;

public class HotelReservationException extends RuntimeException { // create custom exception

    public HotelReservationException( String message) {
        super(message);// to get invalid message

    }
}
