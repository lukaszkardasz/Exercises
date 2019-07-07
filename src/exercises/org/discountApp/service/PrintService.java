package exercises.org.discountApp.service;

import exercises.org.discountApp.client.Client;

/**
 * @author n2god on 08/06/2019
 * @project org
 */
public class PrintService {

    private void welcomeMessage(Client client){
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if (firstName != null && lastName == null){
            System.out.println("Witaj " + firstName);
        } else if (firstName != null && lastName != null){
            System.out.println("Witaj " + firstName + " " + lastName);
        } else if (firstName == null && lastName != null){
            System.out.println("Dzień dobry panie/Pani " + lastName);
        } else {
            System.out.println("Witaj nieznajomy!");
        }
    }

    private void printPrices(double originalPrice, double discountPrice){
        System.out.println("Kwota przed rabatem: " + originalPrice);
        System.out.println("Kwota po rabacie: " + discountPrice);
    }

    public void printInfo(Client client, double originalPrice, double discountPrice){
        welcomeMessage(client);
        printPrices(originalPrice, discountPrice);
    }
}
