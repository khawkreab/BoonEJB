package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Gold;
import service.GoldService;;

@Stateless
@Remote(GoldService.class)
public class GoldServiceBean implements GoldService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Gold gold) {
		// TODO Auto-generated method stub
		this.em.persist(gold);
	}

	@Override
	public Gold findGoldById(long goldId) {
		// TODO Auto-generated method stub
		return this.em.find(Gold.class, goldId);
	}

	@Override
	public void update(Gold gold) {
		// TODO Auto-generated method stub
		this.em.merge(gold);
	}

	@Override
	public void delete(long goldId) {
		// TODO Auto-generated method stub
		Gold pm = findGoldById(goldId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<Gold> getAllGold() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT x FROM Gold x").getResultList();
	}

	@Override
	public List<Gold> findGoldName(String goldname) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT pm FROM Gold pm WHERE pm.goldname LIKE :fn").setParameter("fn", goldname + "%").getResultList();
	}

	@Override
	public List<Gold> findGoldByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Gold p WHERE p.pawnerId.pawnerId =:fn").setParameter("fn", pawnerId).getResultList();	
	}

}
