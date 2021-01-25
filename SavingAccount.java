
public class SavingAccount {
    static double annualInterestRate = 0.4;
    private double savingBalance;
    double m_intrest;

    SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public void display() {
        System.out.println("Saving Balance is: " + savingBalance);
    }

    public void calculateMonthlyInterest() {
        m_intrest = (savingBalance * annualInterestRate) / 12;
        System.out.println(" Intrest is: " + m_intrest);
        savingBalance = savingBalance + m_intrest;
        System.out.println("Saving Balance is " + savingBalance);

    }

    public void modifyInterestRate() {
        double newannualIntrestRate = 0.5;
        System.out.println("new Annual Intrest is:" + newannualIntrestRate);
        calculateMonthlyInterest();
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(12000);
        sa.display();
        sa.calculateMonthlyInterest();
        sa.modifyInterestRate();
    }
}
