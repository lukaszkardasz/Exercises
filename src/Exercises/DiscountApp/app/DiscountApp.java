package Exercises.DiscountApp.app;

import Exercises.DiscountApp.client.Client;
import Exercises.DiscountApp.service.DiscountService;

/**
 * @author n2god on 08/06/2019
 * @project Exercises
 */
public class DiscountApp {

    public static void main(String[] args) {

        Client client1 = new Client("Władek", "Kowalski", false);
        double price1 = 1100;

        Client client2 = new Client("Remigiusz", "Kląb", true);
        double price2 = 2000;

        DiscountService discountService = new DiscountService();
        double discountPrice1 = discountService.calculateDiscountPrice(client1, price1);
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price2);

        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem: " + price1);
        System.out.println("Kwota po rabacie: " + discountPrice1);

        System.out.println("Witaj " + client2.getFirstName() + " " + client2.getLastName());
        System.out.println("Kwota przed rabatem: " + price2);
        System.out.println("Kwota po rabacie: " + discountPrice2);
    }
}
