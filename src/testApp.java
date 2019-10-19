public class testApp {

    public static void main(String[] args){

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.modifyInterestRate(.40);
        saver2.modifyInterestRate(.40);

        for(int i = 0; i < 10; i ++) {
            System.out.printf("===== MONTH %d ======\n", i);
            System.out.println("==SAVER1==");
            saver1.calculateMonthlyInterest();

            System.out.println("==SAVER2==");
            saver2.calculateMonthlyInterest();
            System.out.print("====================\n");
        }

        saver1.modifyInterestRate(.50);
        saver2.modifyInterestRate(.50);

        System.out.println("==SAVER1==");
        saver1.calculateMonthlyInterest();

        System.out.println("==SAVER2==");
        saver2.calculateMonthlyInterest();

    }


}
