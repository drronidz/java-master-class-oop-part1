public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters & setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds ( this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds
        // You will want to create various code in the Main class ( the one created by IntelliJ) to
        // confirm your code is working
        // Add some System.out.println in the two methods above as well

        Account bobAccount = new Account();

        bobAccount.setNumber("12345");
        bobAccount.setBalance(0.00);
        bobAccount.setCustomerName("Bob Brown");
        bobAccount.setCustomerEmailAddress("bob.brown@mit.us");
        bobAccount.setCustomerPhoneNumber("(087) 123-4567");

        bobAccount.withdrawal(100.0);
        bobAccount.deposit(50.0);
        bobAccount.withdrawal(100.0);

        bobAccount.deposit(51.00);
        bobAccount.withdrawal(100.0);

        Account allenAccount = new Account(
                "123456",
                0.00,
                "Allen Macceny",
                "allen.macceny@mit.us",
                "(087) 123-4567");


    }
}
