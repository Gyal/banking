package domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by youniik-nana on 17/02/15.
 */

@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue
    private Long idAccount;

    @Column(nullable = false)
    protected double balance;

    public Long getIdAccount() {
        return idAccount;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}


