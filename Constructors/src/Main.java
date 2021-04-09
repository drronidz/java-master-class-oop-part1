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

        // Create a new class VIPCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value fro the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intelliJ as setters wont be needed
        // test and confirm it works

        Account timAccount = new Account(
                "Tim",
                "tim@email.com",
                "123456");
        System.out.println(timAccount.getNumber() + " name " + timAccount.getCustomerName());
        System.out.println("Current balance is " + timAccount.getBalance());
        timAccount.withdrawal(100.55);
    }
}
