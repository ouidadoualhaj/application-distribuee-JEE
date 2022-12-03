package ma.fstt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_etudiant;
	
	private String nom;
	private String prenom;
	private String cne;
	private String adresse;
	private String niveau;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id_etudiant, String nom, String prenom, String cne, String adresse, String niveau) {
		super();
		this.id_etudiant = id_etudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.cne = cne;
		this.adresse = adresse;
		this.niveau = niveau;
	}

	public int getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [id_etudiant=" + id_etudiant + ", nom=" + nom + ", prenom=" + prenom + ", cne=" + cne
				+ ", adresse=" + adresse + ", niveau=" + niveau + "]";
	}
	
	
}
