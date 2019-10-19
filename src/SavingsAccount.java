public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(){
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double bal){
        savingsBalance = bal;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest(){
        double monthIntrest = (savingsBalance * annualInterestRate) / 12;
        System.out.printf("Current account balance: %.2f\n", savingsBalance);
        savingsBalance += monthIntrest;
        System.out.printf("New account balance: %.2f\n", savingsBalance);
    }

    public double getBalance(){
        return savingsBalance;
    }

    public static void modifyInterestRate(double newIntrest){
        annualInterestRate = newIntrest;
    }

}
