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
    private String lastname;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private int zipCode;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private int phoneNumber;

    @Column(nullable = false)
    private String password;

    public Customer(){}

    //getter & setters
    public Long getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return lastname;
    }

    public void setName(String name) {
        this.lastname = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateBirthDay) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String ville) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getCivilities() {
        return Civilities;
    }

    public void setCivilities(String civilities) {
        Civilities = civilities;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int number) {
        this.phoneNumber = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }
    public String getCountry() {
        return country;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
