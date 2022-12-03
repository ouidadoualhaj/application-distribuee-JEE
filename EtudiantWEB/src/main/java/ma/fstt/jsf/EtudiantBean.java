package ma.fstt.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import ma.fstt.beans.EtudiantTraitementRemote;
import ma.fstt.entities.Etudiant;


@ManagedBean(name = "EtudiantBean")
public class EtudiantBean {


	@EJB
	EtudiantTraitementRemote remote;
	

	private int id_etudiant;	
	private String nom;
	private String prenom;
	private String cne;
	private String adresse;
	private String niveau;

	private Etudiant etudiant;
	
	public String addEtudiant(EtudiantBean etudiantBean) {
		Etudiant etudiant = new Etudiant(0, etudiantBean.nom, etudiantBean.prenom, etudiantBean.cne, etudiantBean.adresse, etudiantBean.niveau);
		remote.save(etudiant);
		return "etudiants.xhtml?faces-redirect=true";
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

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
	
}
