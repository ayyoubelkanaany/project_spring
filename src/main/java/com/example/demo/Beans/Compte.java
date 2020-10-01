package com.example.demo.Beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
/*
Inheritance(strategy = InheritanceType.SINGLE_TABLE) pour dire que nous avons une hiritage d'un seul table.
 ====>  et parce que c'est un seul table on doit spesifier aussi :
  =======> @DiscriminatorColumn(name = "type_cmp",discriminatorType =DiscriminatorType.STRING,length =2 ):
   =========> ceci signifier que le mon qui est hirite est type_cmp de type string et de taill 2.
              par defaut les valeur sont @DiscriminatorColumn(name = "TYPE",discriminatorType =DiscriminatorType.STRING,length =255 )

@ManyToOne ///un client peut avoir plusieur comptes
@JoinColumn(name = "code_client")///cle etrangere dans la table compte
@ManyToOne ///un employe peut creer plusieur compte
 @JoinColumn(name = "code_employe")///cle etrangere dans la table compte 
*/
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_cmp",discriminatorType =DiscriminatorType.STRING,length =2 )
public abstract class Compte implements Serializable{
	@Id
 private String code_cmp;
 private Date date_creation;
 private double solde;
 @ManyToOne 
 @JoinColumn(name = "code_client")
 private Client client;
 @ManyToOne 
 @JoinColumn(name = "code_employe")
 private Employe employe;
 @OneToMany(mappedBy = "compte")
 private Collection<Operation> operations;
public Compte() {
	super();
}
public Compte(String code_cmp, Date date_creation, double solde) {
	super();
	this.code_cmp = code_cmp;
	this.date_creation = date_creation;
	this.solde = solde;
}
public String getCode_cmp() {
	return code_cmp;
}
public void setCode_cmp(String code_cmp) {
	this.code_cmp = code_cmp;
}
public Date getDate_creation() {
	return date_creation;
}
public void setDate_creation(Date date_creation) {
	this.date_creation = date_creation;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Collection<Operation> getOperations() {
	return operations;
}
public void setOperations(Collection<Operation> operations) {
	this.operations = operations;
}


 
}
