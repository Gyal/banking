package fr.iut.lpcsid.bankingProject.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by NIIRO on 18/02/2015.
 */

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private Long idTransaction;

    @Column(nullable = false)
    private String transactionName;

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

    public String getTransactionName() {
        return transactionName;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
}
