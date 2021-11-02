//Student Name: Aaron Zuefeldt
//Course: 2317 - Java Programming
//Date: 07/05/19
package loan;

import java.util.Scanner;

public class AaronZuefeldtLoan {

    private double loanAmt;
    private double interestRate;
    private double interestAmount;
    private double totalAmt;

    public AaronZuefeldtLoan() {
        loanAmt = 0;
        interestRate = 0;
        interestAmount = 0;
        totalAmt = 0;

    }

    public double getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    // complete the calculateLoan method
    public void calculateLoan() {
        double interestCalc = this.getLoanAmt() * this.getInterestRate();

        System.out.println("loan amount : $" + this.getLoanAmt());
        System.out.println("interest rate: " + (this.getInterestRate() * 100) + "%");
        System.out.println("interest : $" + interestCalc);

        // calculate the cumlative interestAmount
        this.interestAmount += interestCalc;

        // compute the cumlative loanAmt
        this.totalAmt+=this.getLoanAmt();
    }

    public static void main(String[] args) {
        String flag = "";
        int counter = 0;
        double loanvalue = 0.0;
        double interest = 0.0;
        System.out.println("Welcome to the Interest Calculator");

        AaronZuefeldtLoan obj = new AaronZuefeldtLoan();

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter loan amount : ");
            loanvalue = keyboard.nextDouble();
            System.out.print("Enter interest rate: ");
            interest = keyboard.nextDouble();
            obj.setLoanAmt(loanvalue);
            obj.setInterestRate(interest);
            obj.calculateLoan();

            System.out.print("\nWould you like to enter another loan amount? (y/n):");
            Scanner input = new Scanner(System.in);
            flag = input.nextLine();

            if (++counter >= 3)
                flag = "n";
        } while (flag.equalsIgnoreCase("Y"));
        System.out.println("\nTotal loan : " + obj.getTotalAmt());
        System.out.println("Total interest : " + (obj.getLoanAmt() * obj.getInterestAmount()));
    }
}
