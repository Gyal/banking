package domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by youniik-nana on 17/02/15.
 */
public class Customer implements Serializable{

    //Variables
    @Id
    @GeneratedValue
    private Long idCustomer;

    @Column(nullable = false)
    private String Civilities;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private Date dateBirthDay;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String ville;

    @Column(nullable = false)
    private int cp;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private int number;

    @Column(nullable = false)
    private String mdp;

    public Customer(){}

    //getter & setters
    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateBirthDay() {
        return dateBirthDay;
    }

    public void setDateBirthDay(Date dateBirthDay) {
        this.dateBirthDay = dateBirthDay;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCivilities() {
        return Civilities;
    }

    public void setCivilities(String civilities) {
        Civilities = civilities;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
