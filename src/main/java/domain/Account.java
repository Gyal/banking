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
    private int idAccount ;

    @Column(nullable = false)
    private String libelleAccount;

    @Column(nullable = false)
    private int numCustomerCredited;


    @Column(nullable = false)
    protected int numCustomerDebited;

    @Column(nullable = false)
    protected double solde;


    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getLibelleAccount() {
        return libelleAccount;
    }

    public void setLibelleAccount(String libelleAccount) {
        this.libelleAccount = libelleAccount;
    }

    public int getNumCustomerCredited() {
        return numCustomerCredited;
    }

    public void setNumCustomerCredited(int numCustomer) {
        this.numCustomerCredited = numCustomer;
    }


    public int getNumCustomerDebited() {
        return numCustomerDebited;
    }

    public void setNumCustomerDebited(int numCustomerDebited) {
        this.numCustomerDebited = numCustomerDebited;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
}


