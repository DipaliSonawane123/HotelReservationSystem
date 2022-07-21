package com.hotelreservation;

import java.util.HashMap;
import java.util.Map;

public class HotelReservation {
   /*
   hashmap to accept hotels
    */
    Map<String, Hotel> hotelList = new HashMap<String, Hotel>();
    Hotel hotels; // referance variable to access hotel class


/*
method to add hotels
 */
  Boolean result;
    public boolean addHotel(String hotelName, double weekdayRateRegular, double weekendRateRegular)
    {

        hotels = new Hotel();//creating object hotel class
        /*
        calling method from hotel to set inputs manually
         */
        hotels.setHotelName(hotelName);//set method to set hotel name
        hotels.getHotelName();
        hotels.setWeekdayRegularCustomerPrice(weekdayRateRegular);//set weekday customer price  as per given value
        hotels.getWeekdayRegularCustomerPrice();
        hotels.setWeekendRegularCustomerPrice(weekendRateRegular);//set weekend customer price as per given value
        hotels.getWeekendRegularCustomerPrice();

        hotelList.put(hotelName, hotels);//put hotels in hashmap
        System.out.println(hotels);

        return true;
           }
    }



