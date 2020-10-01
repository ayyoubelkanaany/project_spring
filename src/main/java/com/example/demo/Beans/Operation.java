package com.example.demo.Beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 1)
public class Operation implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long num_op;
private Date date_op;
private double montant_op;
@ManyToOne
@JoinColumn(name = "code_compte")
private Compte compte;
@ManyToOne
@JoinColumn(name="code_employe")
private Employe employe;
public Operation() {
	super();
}
public Operation(Date date_op, double montant_op) {
	super();
	this.date_op = date_op;
	this.montant_op = montant_op;
}
public Long getNum_op() {
	return num_op;
}
public void setNum_op(Long num_op) {
	this.num_op = num_op;
}
public Date getDate_op() {
	return date_op;
}
public void setDate_op(Date date_op) {
	this.date_op = date_op;
}
public double getMontant_op() {
	return montant_op;
}
public void setMontant_op(double montant_op) {
	this.montant_op = montant_op;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}


}
