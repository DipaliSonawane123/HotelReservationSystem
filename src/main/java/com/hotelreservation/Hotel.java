package com.hotelreservation;

public class Hotel {
/*
variables
 */
    String hotelName;
    int rating;
    double weekdayRegularCustomerCost;
    double weekendRegularCustomerCost;
/*
default construtor
 */
    public Hotel() {

    }
/*
Parameterize construtor
 */
    public Hotel(String hotelName, int rating, double weekdayRegularCustomerCost, double weekdayRewardCustomerCost,
                 double weekendRegularCustomerCost, double weekendRewardCustomerCost) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public double getWeekdayRegularCustomerPrice() {
        return weekdayRegularCustomerCost;
    }

    public void setWeekdayRegularCustomerPrice(double weekdayRegularCustomerCost) {
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
    }

    public double getWeekendRegularCustomerPrice() {
        return weekendRegularCustomerCost;
    }

    public void setWeekendRegularCustomerPrice(double weekendRegularCustomerCost) {
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
    }
/*
method to add variable to string as object
 */
    @Override
    public String toString() {
        return "Hotels [hotelName=" + hotelName +  ", weekdayRegularCustomerPrice="
                + weekdayRegularCustomerCost + ", weekendRegularCustomerPrice=" + weekendRegularCustomerCost + "]";
    }

}

