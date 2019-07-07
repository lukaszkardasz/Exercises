package exercises.org.bank;

public class Bank {

    public static void main(String[] args) {
        Adress adress1 = new Adress();
        adress1.city = "Bialystok";
        adress1.houseNumber = 10;
        adress1.number = 115;
        adress1.street = "Rolna";
        adress1.zipCode = "15-188";

        Adress adress2 = new Adress();
        adress2.city = "Warszawa";
        adress2.houseNumber = 101;
        adress2.number = 15;
        adress2.street = "Wolna";
        adress2.zipCode = "12-128";

        Person client1 = new Person();
        client1.firstName = "Jan";
        client1.lastName = "Kowalski";
        client1.pesel = "1500100900";
        client1.livingAdress = adress1;
        client1.postAdress = adress1;

        Person client2 = new Person();
        client2.firstName = "Daria";
        client2.lastName = "Kurczak";
        client2.pesel = "1300100900";
        client2.livingAdress = adress1;
        client2.postAdress = adress2;

        BankAccount account1 = new BankAccount();
        account1.owner = client1;
        account1.livingAdress = adress1;
        account1.postAdress = adress1;
        account1.balance = 1_500.50;

        BankAccount account2 = new BankAccount();
        account2.owner = client2;
        account2.livingAdress = adress2;
        account2.postAdress = adress2;
        account2.balance = 2_500.80;

        Credit credit1 = new Credit();
        credit1.borrower = client1;
        credit1.cashBorrowed = 2_000.00;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba 1:");
        System.out.println(client1.firstName + " " + client1.lastName + " " + client1.pesel);
        System.out.println("Mieszka w miejscowości " + client1.postAdress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println("Osoba 2:");
        System.out.println(client2.firstName + " " + client2.lastName + " " + client1.pesel);
        System.out.println("Mieszka w miejscowości " + client2.postAdress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
    }
}
