package Exercises.Bank;

public class Bank {

    public static void main(String[] args) {
        Person client1 = new Person();
        client1.firstName = "Jan";
        client1.lastName = "Kowalski";
        client1.pesel = "1500100900";

        BankAccount account1 = new BankAccount();
        account1.owner = client1;
        account1.balance = 1_500.50;

        Credit credit1 = new Credit();
        credit1.borrower = client1;
        credit1.cashBorrowed = 2_000.00;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(client1.firstName + " " + client1.lastName + " " + client1.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}
