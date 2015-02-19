package domain;

import javax.persistence.*;

/**
 * Created by NIIRO on 18/02/2015.
 */

@Entity
@Table(name = "account_type")
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_type_id")
    private Long idAccountType;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private double celling;

    @Column(nullable = false)
    private double percentage;

    public double getPercentage() {
        return percentage;
    }

    public double getCelling() {
        return celling;
    }

    public String getTitle() {
        return title;
    }

    public long getIdAccountType() {
        return idAccountType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCelling(double celling) {
        this.celling = celling;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
