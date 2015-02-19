package domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by youniik-nana on 17/02/15.
 */
@Entity
@Table(name = "account")
public class Account implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinTable(name = "account_customer", joinColumns = {@JoinColumn(name = "account_id")}, inverseJoinColumns = {@JoinColumn(name = "customer_id")})
    @Id
    @Column(name = "account_id")
    private Long idAccount ;

    @Column(nullable = false)
    private String libelleAccount;

    @Column(nullable = false)
    private int numCustomerCredited;


    @Column(nullable = false)
    protected int numCustomerDebited;

    @Column(nullable = false)
    protected double solde;


    public long getIdAccount() {
        return idAccount;
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


