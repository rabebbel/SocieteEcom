package com.net.societe.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ville {
	@Id
	@Column(name = "idVille")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVille;
	private String NomVille;
	
	@ManyToOne
	@JoinColumn(name ="idGouvernement")
	private Gouvernement  gouvernement;
	
	@OneToMany(mappedBy = "ville", cascade = CascadeType.ALL)
	private List<Entreprise> entreprises;

	public Long getIdVille() {
		return idVille;
	}

	public void setIdVille(Long idVille) {
		this.idVille = idVille;
	}

	public String getNomVille() {
		return NomVille;
	}

	public void setNomVille(String nomVille) {
		NomVille = nomVille;
	}

	public Gouvernement getGouvernement() {
		return gouvernement;
	}

	public void setGouvernement(Gouvernement gouvernement) {
		this.gouvernement = gouvernement;
	}

	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}

	public Ville(Long idVille, String nomVille, Gouvernement gouvernement, List<Entreprise> entreprises) {
		super();
		this.idVille = idVille;
		NomVille = nomVille;
		this.gouvernement = gouvernement;
		this.entreprises = entreprises;
	}

	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
