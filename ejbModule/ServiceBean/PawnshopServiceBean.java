package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Pawnshop;
import service.PawnshopService;

@Stateless
@Remote(PawnshopService.class)
public class PawnshopServiceBean implements PawnshopService {

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Pawnshop pawnshop) {
		// TODO Auto-generated method stub
		this.em.persist(pawnshop);
	}

	@Override
	public Pawnshop findPawnshopById(long pawnshopId) {
		// TODO Auto-generated method stub
		return this.em.find(Pawnshop.class, pawnshopId);
	}

	@Override
	public void update(Pawnshop pawnshop) {
		// TODO Auto-generated method stub
		this.em.merge(pawnshop);
	}

	@Override
	public void delete(long pawnshopId) {
		// TODO Auto-generated method stub
		Pawnshop ps = findPawnshopById(pawnshopId);
		if (ps != null) {
			this.em.remove(ps);
		}
	}

	@Override
	public List<Pawnshop> getAllPawnshop() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT x FROM Pawnshop x").getResultList();
	}

	@Override
	public List<Pawnshop> findPawnshopName(String name) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT c FROM Pawnshop c WHERE c.pawnshopName LIKE :name").setParameter("name", name + "%").getResultList();
	}
	
	@Override
	public Pawnshop findPawnShopByEmailAndPassword(String email, String password) {
		return (Pawnshop) em.createQuery("SELECT c FROM Pawnshop c WHERE c.pawnshopEmail =:email AND c.pawnshopPassword =:password").setParameter("email", email).setParameter("password", password).getSingleResult();
	}
	@Override
	public void updatePawnshopState(long pawnshopId,String pawnshopState) {
		em.createQuery("update Pawnshop s set s.pawnshopState =:pawnshopState WHERE s.pawnshopId =:pawnshopId" 
				).setParameter("pawnshopId", pawnshopId).setParameter("pawnshopState", pawnshopState).executeUpdate();
	}

}
