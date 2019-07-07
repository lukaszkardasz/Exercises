package exercises.org.discountApp.app;

import exercises.org.discountApp.service.DiscountService;
import exercises.org.discountApp.service.PrintService;
import exercises.org.discountApp.client.Client;

/**
 * @author n2god on 08/06/2019
 * @project org
 */
public class DiscountApp {

    public static void main(String[] args) {

        Client client1 = new Client(null, "Kowalski", false);
        double price1 = 1100;

        Client client2 = new Client(null, null, true);
        double price2 = 2000;

        Client client3 = new Client("Jan", null, false);
        double price3 = 3000;

        DiscountService discountService = new DiscountService();
        double discountPrice1 = discountService.calculateDiscountPrice(client1, price1);
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price2);
        double discountPrice3 = discountService.calculateDiscountPrice(client3, price3);

        PrintService printService = new PrintService();
        printService.printInfo(client1, price1, discountPrice1);
        printService.printInfo(client2, price2, discountPrice2);
        printService.printInfo(client3, price3, discountPrice3);




    }
}
