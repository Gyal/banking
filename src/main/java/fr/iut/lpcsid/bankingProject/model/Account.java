package fr.iut.lpcsid.bankingProject.model;


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
    protected double solde;

    public Account(Long idAccount, String libelleAccount, double solde) {
        this.idAccount = idAccount;
        this.libelleAccount = libelleAccount;
        this.solde = solde;
    }

    public long getIdAccount() {
        return idAccount;
    }

    public String getLibelleAccount() {
        return libelleAccount;
    }
    public void setLibelleAccount(String libelleAccount) {
        this.libelleAccount = libelleAccount;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void debit(int amount){ this.solde = this.solde - amount; };

    public void credit(int amount) { this.solde = this.solde + amount; };
}


