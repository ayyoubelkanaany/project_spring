package com.example.demo.Beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte  {
  private double taux;

public CompteEpargne() {
	super();
}

public CompteEpargne(String code_cmp, Date date_creation, double solde, double taux) {
	super(code_cmp, date_creation, solde);
	this.taux = taux;
}

public double getTaux() {
	return taux;
}

public void setTaux(double taux) {
	this.taux = taux;
}
  
}
