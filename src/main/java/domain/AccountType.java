package domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by NIIRO on 18/02/2015.
 */

@Entity
public class AccountType {

    @Column(nullable = false)
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

    public Long getIdAccountType() {
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
