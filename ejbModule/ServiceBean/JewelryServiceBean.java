package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Jewelry;
import service.JewelryService;;

@Stateless
@Remote(JewelryService.class)
public class JewelryServiceBean implements JewelryService{
	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Jewelry jewelry) {
		// TODO Auto-generated method stub
		this.em.persist(jewelry);
	}

	@Override
	public Jewelry findJewelryById(long jewelryId) {
		// TODO Auto-generated method stub
		return this.em.find(Jewelry.class, jewelryId);
	}

	@Override
	public void update(Jewelry jewelry) {
		// TODO Auto-generated method stub
		this.em.merge(jewelry);
	}

	@Override
	public void delete(long jewelryId) {
		// TODO Auto-generated method stub
		Jewelry pm = findJewelryById(jewelryId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<Jewelry> getAllJewelry() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT x FROM Jewelry x").getResultList();
	}

	@Override
	public List<Jewelry> findJewelryName(String jewelryname) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT pm FROM Jewelry pm WHERE pm.jewelryname LIKE :fn").setParameter("fn", jewelryname + "%").getResultList();
	}

	@Override
	public List<Jewelry> findJewelryByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Jewelry p WHERE p.pawnerId.pawnerId =:fn").setParameter("fn", pawnerId).getResultList();	
	}

}
