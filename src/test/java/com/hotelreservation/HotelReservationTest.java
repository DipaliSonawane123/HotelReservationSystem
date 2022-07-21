package com.hotelreservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class HotelReservationTest {
    boolean isValidHotel;
    boolean result;

    @Test
    public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnTrue() {
        try {
            HotelReservation hotelReservationService = new HotelReservation();

            if (!result)
            /*
        check the condition of uc 1 and give the input
         */
                isValidHotel = hotelReservationService.addHotel("Lakewood", 110, 90);
                System.out.println(isValidHotel);
                Assertions.assertTrue(isValidHotel);
                isValidHotel = hotelReservationService.addHotel("Bridgewood", 16, 60);
                System.out.println(isValidHotel);
                Assertions.assertTrue(isValidHotel);
                isValidHotel = hotelReservationService.addHotel("Ridgewood", 220, 150);
                 System.out.println(isValidHotel);
                 Assertions.assertTrue(isValidHotel);
        } catch (HotelReservationException e) {
            System.out.println(e.getMessage());
        }
    }
}


