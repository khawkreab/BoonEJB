package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Pawner;
import service.PawnerService;

@Stateless
@Remote(PawnerService.class)
public class PawnerServiceBean implements PawnerService {

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Pawner pawner) {
		// TODO Auto-generated method stub
		this.em.persist(pawner);
	}

	@Override
	public Pawner findPawnerById(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.find(Pawner.class, pawnerId);
	}

	@Override
	public void update(Pawner pawner) {
		// TODO Auto-generated method stub
		this.em.merge(pawner);
	}

	@Override
	public void delete(long pawnerId) {
		// TODO Auto-generated method stub
		Pawner pm = findPawnerById(pawnerId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<Pawner> getAllPawner() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT c FROM Pawner c").getResultList();
	}

	@Override
	public List<Pawner> findPawnerFirstName(String name) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Pawner p WHERE p.pawnerFirstname LIKE :name").setParameter("name", name + "%").getResultList();
	}
	
	@Override
	public List<Pawner> findPawnerEmai(String email) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Pawner p WHERE p.pawnerEmail LIKE :email").setParameter("email", email + "%").getResultList();
	}
	
	
	@Override
	public Pawner findPawnerByEmailAndPassword(String email, String password) {
		return (Pawner) this.em.createQuery("SELECT p FROM Pawner p WHERE p.pawnerEmail =:email AND p.pawnerPassword =:password").setParameter("email", email).setParameter("password", password)
				.getSingleResult();
	}

	@Override
	public void updatePawnerState(long pawnerId, String status) {
		em.createQuery("update Pawner s set s.pawnerStatus =:staus WHERE s.pawnerId =:pawnerId" 
				).setParameter("pawnerId", pawnerId).setParameter("staus", status).executeUpdate();
		
	}

}
