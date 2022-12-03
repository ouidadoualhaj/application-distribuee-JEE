package ma.fstt.beans;

import java.util.List;

import javax.ejb.Remote;

import ma.fstt.entities.Etudiant;

@Remote
public interface EtudiantTraitementRemote {

	public void save(Etudiant etudiant);
	public List<Etudiant> list();
	public Etudiant getById(int id_etudiant);
	public void update(Etudiant etudiant);
	public void delete(Etudiant etudiant);
}
