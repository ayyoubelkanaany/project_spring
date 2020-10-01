package com.example.demo.Beans;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code_cli;
	private String nom_cli;
	///fetchType.Lazy signifier que les comptes ne seront pas charger de la base de donnees lorsqu'un client est charger,mais selement le nom et le ccode.
	// alors que fetchType.EAGER charge tou les information du client meme ses comptes.
	///par defaut c'est leazy.
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Collection<Compte> comptes;

	
	public Client() {
		super();
	}
	
	public Client(String nom_cli) {
		super();
		this.nom_cli = nom_cli;
	}

	public Long getCode_cli() {
		return code_cli;
	}
	public void setCode_cli(Long code_cli) {
		this.code_cli = code_cli;
	}
	public String getNom_cli() {
		return nom_cli;
	}
	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
}
