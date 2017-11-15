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
		return this.em.createQuery("SELECT x FROM Pawner x").getResultList();
	}

	@Override
	public List<Pawner> findPawnerFirstName(String name) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT pm FROM Pawner pm WHERE pm.firstName LIKE :fn").setParameter("fn", name + "%").getResultList();
	}
	
	@Override
	public Pawner findPawnerUserName(String email, String password) {
		return (Pawner) this.em.createQuery("SELECT p FROM Pawner p WHERE p.email =:un AND p.password =:pw").setParameter("un", email).setParameter("pw", password)
				.getSingleResult();
	}

}
