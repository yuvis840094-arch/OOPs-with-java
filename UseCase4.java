public class UseCase4 {
    public static void main(String[] args) {
        double balance = 1000;
        double withdrawAmount = 500;

        try{
            withdraw(balance, withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Transaction completed.");
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance-amount));
        }
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) { // Parameterized Constructor for the custom exception
        super(message);
    }
}
