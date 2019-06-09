package Exercises.discountApp.service;

import Exercises.discountApp.client.Client;

/**
 * @author n2god on 08/06/2019
 * @project Exercises
 */
public class DiscountService {

    public double calculateDiscountPrice(Client client, double price) {
        if (client.isPremium()) {
            return calculatePremiumDiscount(price);
        } else {
            return calculateStandardDiscount(price);
        }
    }

    private double calculateStandardDiscount(double price) {
        return calculateDiscount(price, 0.1);
    }

    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return calculateDiscount(price, 0.15);
        } else
            return calculateDiscount(price, 0.05);
    }

    private double calculateDiscount(double price, double discount) {
        return price * (1 - discount);
    }

}
