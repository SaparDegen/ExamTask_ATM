public class BankAccount {
    private double amount;

    public double getAmount() {                        //возвращает текущий остаток на счете,
        return amount;
    }

    public void deposit(double sum) throws Exception {     //положить деньги на счет,
        if (sum <= 60000) {
            double accountBalance = getAmount();
            if ((accountBalance + sum) <= 200000) {
                this.amount += sum;
            } else {
                throw new LimitException("The ballance more than 200000 som, now balance is ", accountBalance);
            }
        } else {
            throw new Exception("Sum of deposit must be less then 60000 som");
        }
    }

    public void withDraw(double sum) throws Exception {              //снимает указанную сумму со счета.
        if (sum <= 55000) {
            double accountBalance = getAmount();
            if ((accountBalance - sum) >= 0) {
                this.amount -= sum;
            } else {
                throw new Exception("The withdrawing sum greater then balance, now balance is " + accountBalance);
            }
        } else {
            throw new Exception("Withdrawing sum must be less then 55000 som");
        }
    }
}
