package com.net.societe.entities;

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
public class SousCategorie {
	
	@Id
	@Column(name = "idSousCategorie")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSousCategorie;
	private String nomSouCat;
	

@ManyToOne
@JoinColumn(name ="idCategorie")
private Categorie  categorie;

@OneToMany(mappedBy = "sousCategorie", cascade = CascadeType.ALL)
private List<Entreprise> entreprises;

public Long getIdSousCategorie() {
	return idSousCategorie;
}

public void setIdSousCategorie(Long idSousCategorie) {
	this.idSousCategorie = idSousCategorie;
}

public String getNomSouCat() {
	return nomSouCat;
}

public void setNomSouCat(String nomSouCat) {
	this.nomSouCat = nomSouCat;
}

public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}

public List<Entreprise> getEntreprises() {
	return entreprises;
}

public void setEntreprises(List<Entreprise> entreprises) {
	this.entreprises = entreprises;
}

public SousCategorie(Long idSousCategorie, String nomSouCat, Categorie categorie, List<Entreprise> entreprises) {
	super();
	this.idSousCategorie = idSousCategorie;
	this.nomSouCat = nomSouCat;
	this.categorie = categorie;
	this.entreprises = entreprises;
}

public SousCategorie() {
	super();
	// TODO Auto-generated constructor stub
}

}
