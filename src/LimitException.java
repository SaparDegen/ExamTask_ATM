public class LimitException extends Exception{
    LimitException(String message, double remainingAmount) {
        super(message + ", " + remainingAmount);
    }

    public double getRemainingAmount() {
        BankAccount bankAccount = new BankAccount();
        return bankAccount.getAmount();
    }
}
