package com.example.demo.Beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/*
@DiscriminatorValue("CC") : est ecrit dans une class dirivee, pour dire que la valeur de @DiscriminatorColumn est CC a chaque fois que nous utilisant cette class
*/
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte  {
	private double decouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(String code_cmp, Date date_creation, double solde, double decouvert) {
		super(code_cmp, date_creation, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	

}
