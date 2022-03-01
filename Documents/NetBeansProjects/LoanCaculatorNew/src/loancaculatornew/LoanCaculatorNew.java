/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancaculatornew;

import java.util.Scanner;

/**
 *
 * @author jeanl
 */
public class LoanCaculatorNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Let user input data of Loan info
        Scanner sc = new Scanner(System.in);
        LoanInfo loaninfo = new LoanInfo();

        System.out.println("Entrez Interest Rate: ");
        float interestRate = sc.nextFloat();
        loaninfo.setInterestRate(interestRate);

        System.out.println("Entrez Number of Years: ");
        byte numberOfYears = sc.nextByte();
        loaninfo.setNumberOfYears(numberOfYears);

        System.out.println("Entrez Loan Amount: ");
        int loanAmount = sc.nextInt();
        loaninfo.setLoanAmount(loanAmount);

        //Get Monthly Interest
        float monthlyInterest = (float) (interestRate / 100 / 12);
        float monthlyRate = monthlyInterest * 100;

        //Get monthly payment
        float m = monthlyInterest + 1;
        int n = numberOfYears * 12;
        double z = Math.pow(n, m);
        double monthlyPayment = loanAmount * monthlyInterest / (1 - 1 / z);

        //Get total payment
        double totalPayment = monthlyPayment * 12 * numberOfYears;

        //Output results
        System.out.println("Votre Monthly Payment: " + String.format("%.2f", monthlyPayment));
        System.out.println("Votre Total Payment: " + String.format("%.2f", totalPayment));

    }
    
}
