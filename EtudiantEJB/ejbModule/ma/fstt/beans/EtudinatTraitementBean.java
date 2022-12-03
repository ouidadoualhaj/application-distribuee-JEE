package ma.fstt.beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.fstt.entities.Etudiant;

@Stateless(name="GEtudiant")
public class EtudinatTraitementBean implements EtudiantTraitementRemote{

	@PersistenceContext(unitName="Etudiant")
	private EntityManager entityManager;
	
	@Override
	public void save(Etudiant etudiant) {
		System.out.println("Save : " + etudiant.toString());		
		entityManager.persist(etudiant);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Etudiant> list() {
		System.out.println("List des etudiants");
		Query qry = entityManager.createQuery("Select e from Etudiant e");
		return qry.getResultList();
	}

	@Override
	public Etudiant getById(int id_etudiant) {
		System.out.println("idEtudiant : " + id_etudiant);
		Etudiant etudiant = entityManager.find(Etudiant.class, id_etudiant);
		if(etudiant == null)
			throw new RuntimeException("Etudiant introuvale !");
		return etudiant;
	}

	@Override
	public void update(Etudiant etudiant) {
		System.out.println("Update : " + etudiant.toString());
		entityManager.refresh(etudiant);
	}

	@Override
	public void delete(Etudiant etudiant) {
		System.out.println("Delete : " + etudiant.toString());
		entityManager.remove(etudiant);
	}
	
}
