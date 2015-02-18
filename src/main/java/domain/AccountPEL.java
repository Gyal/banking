package domain;

import javax.persistence.Column;

/**
 * Created by youniik-nana on 17/02/15.
 */
public class AccountPEL extends Account{

    @Column(nullable = false)
    private int duree;

    @Column(nullable = false)
    private double taux;

    public void soldeAccount(){
        solde = solde + (solde*taux);
    }
}
