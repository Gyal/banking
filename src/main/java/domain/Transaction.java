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
    private int NumDebitedAccount;

    @Column(nullable = false)
    private int NumCreditedAccount;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private Date transactionDate;

    public Transaction(int numDebitedAccount, int numCreditedAccount, double amount, Date transactionDate) {
        NumDebitedAccount = numDebitedAccount;
        NumCreditedAccount = numCreditedAccount;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

}
