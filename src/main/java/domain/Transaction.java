package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by NIIRO on 18/02/2015.
 */

@Entity
public class Transaction {

    @Column(nullable = false)
    private Long idTransaction;

    @Column(nullable = false)
    private int NumDebitedAccount;

    @Column(nullable = false)
    private int NumCreditedAccount;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private Date transactionDate;

    public Transaction(Long idTransaction, int numDebitedAccount, int numCreditedAccount, double amount, Date transactionDate) {
        this.idTransaction = idTransaction;
        NumDebitedAccount = numDebitedAccount;
        NumCreditedAccount = numCreditedAccount;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public int getNumDebitedAccount() {
        return NumDebitedAccount;
    }

    public double getAmount() {
        return amount;
    }

    public int getNumCreditedAccount() {
        return NumCreditedAccount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setNumDebitedAccount(int numDebitedAccount) {
        NumDebitedAccount = numDebitedAccount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setNumCreditedAccount(int numCreditedAccount) {
        NumCreditedAccount = numCreditedAccount;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
