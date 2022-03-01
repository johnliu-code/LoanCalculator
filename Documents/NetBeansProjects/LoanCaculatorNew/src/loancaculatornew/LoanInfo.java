/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancaculatornew;

/**
 *
 * @author jeanl
 */
public class LoanInfo {
    // Initial interest rate, number of year and loan amount;

    private float interestRate;
    private byte numberOfYears;
    private int loanAmount;

    // Create constructor
    public LoanInfo() {
    }

    //Add method getter and setter

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public byte getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(byte numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
    
}
