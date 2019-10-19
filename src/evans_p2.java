class SavingsAccount{

    public static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double balance){
        this.savingsBalance = balance;
    }
    // Gets the monthly rate for each month
    public void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }

    public void getBalance(){
        System.out.printf("$%.2f\n", this.savingsBalance);
    }

    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
}

public class evans_p2 {
    public static void main(String[]args){

        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0);

        //Prints out Saver 1's balance each month.
        System.out.println("Saver 1's Balance: \n");
        for(int i = 0; i < 12; i++){
            saver1.calculateMonthlyInterest();
            System.out.print("Month " + (i + 1) + ": ");
            saver1.getBalance();
        }
        System.out.println();
        // Prints out Saver 2's balance each month.
        System.out.println("Saver 2's Balance: \n");
        for(int i = 0; i < 12; i++){
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + (i + 1) + ": ");
            saver2.getBalance();
        }
        System.out.println();

        // Prints out the balance when changed to 5%.
        System.out.println("Rate changed to 5%");
        System.out.println();
        SavingsAccount.modifyInterestRate(5.0);

        // Recalculates with new rate.
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Prints the 13th month balance for each saver.
        System.out.println("Saver 1's Balance: ");
        System.out.print("Month 13: ");
        saver1.getBalance();
        System.out.println();

        System.out.println("Saver 2's Balance: ");
        System.out.print("Month 13: ");
        saver2.getBalance();


    }
}
