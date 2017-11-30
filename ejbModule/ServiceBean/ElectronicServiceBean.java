package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Electronic;
import service.ElectronicService;;

@Stateless
@Remote(ElectronicService.class)
public class ElectronicServiceBean implements ElectronicService{
	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Electronic electronic) {
		// TODO Auto-generated method stub
		this.em.persist(electronic);
	}

	@Override
	public Electronic findElectronicById(long electronicId) {
		// TODO Auto-generated method stub
		return this.em.find(Electronic.class, electronicId);
	}

	@Override
	public void update(Electronic electronic) {
		// TODO Auto-generated method stub
		this.em.merge(electronic);
	}

	@Override
	public void delete(long electronicId) {
		// TODO Auto-generated method stub
		Electronic pm = findElectronicById(electronicId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<Electronic> getAllElectronic() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT x FROM Electronic x").getResultList();
	}

	@Override
	public List<Electronic> findElectronicName(String electronicname) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT pm FROM Electronic pm WHERE pm.electronicname LIKE :fn").setParameter("fn", electronicname + "%").getResultList();
	}

	@Override
	public List<Electronic> findElectronicByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Electronic p WHERE p.pawnerId.pawnerId =:fn").setParameter("fn", pawnerId).getResultList();	
	}

}
