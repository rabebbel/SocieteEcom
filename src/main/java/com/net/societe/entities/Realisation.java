package com.net.societe.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Realisation {
	
	@Id
	@Column(name = "idRealisation")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRealisation;
	
	private String description;
	private String titre;
	private byte[] photo;
	private Date datePub;
	
	@ManyToOne
	@JoinColumn(name ="idEntreprise")
	private Entreprise  entrepriseReal;

	public Long getIdRealisation() {
		return idRealisation;
	}

	public void setIdRealisation(Long idRealisation) {
		this.idRealisation = idRealisation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Date getDatePub() {
		return datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}

	public Entreprise getEntrepriseReal() {
		return entrepriseReal;
	}

	public void setEntrepriseReal(Entreprise entrepriseReal) {
		this.entrepriseReal = entrepriseReal;
	}

	public Realisation(Long idRealisation, String description, String titre, byte[] photo, Date datePub,
			Entreprise entrepriseReal) {
		super();
		this.idRealisation = idRealisation;
		this.description = description;
		this.titre = titre;
		this.photo = photo;
		this.datePub = datePub;
		this.entrepriseReal = entrepriseReal;
	}

	public Realisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
