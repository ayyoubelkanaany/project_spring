package com.example.demo.Beans;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Employe implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long code_emp;
private String nom_emp;
@ManyToOne
@JoinColumn(name="code_employe_sup")
private Employe employe_sup;
@ManyToMany /// dan ce cas nous sommes obligie de specifier le nom de la table de jointure avec les cle comme valeur par defaut
@JoinTable(name = "employe_groupe")
private Collection<Groupe> groupes;
public Employe() {
	super();
}
public Employe(String nom_emp) {
	super();
	this.nom_emp = nom_emp;
}
public Long getCode_emp() {
	return code_emp;
}
public void setCode_emp(Long code_emp) {
	this.code_emp = code_emp;
}
public String getNom_emp() {
	return nom_emp;
}
public void setNom_emp(String nom_emp) {
	this.nom_emp = nom_emp;
}
public Employe getEmploye_sup() {
	return employe_sup;
}
public void setEmploye_sup(Employe employe_sup) {
	this.employe_sup = employe_sup;
}
public Collection<Groupe> getGroupes() {
	return groupes;
}
public void setGroupes(Collection<Groupe> groupes) {
	this.groupes = groupes;
}



}
