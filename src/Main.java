import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Scanner in1 = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount();
        commands();
        String a;
        do {
            a = button();
            if (a.equals("1")) {
                System.out.println(bankAccount.getAmount());
            } else if (a.equals("2")) {
                System.out.print("Enter your deposit sum: ");
                double depositSum = in.nextDouble();
                bankAccount.deposit(depositSum);
            } else if (a.equals("3")) {
                System.out.print("Enter your withdrawing sum: ");
                double withDrawingSum = in.nextDouble();
                bankAccount.withDraw(withDrawingSum);
            }
        } while (a != "4");
    }

    static void commands() {
        System.out.println("1 show the balance of the bank account");
        System.out.println("2 deposit on the account");
        System.out.println("3 withdraw from the account");
    }

    static String button(){
        System.out.print("Choose a command: ");
        return in1.nextLine();
    }
}