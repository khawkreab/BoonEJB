/* 
// page : PawnshopEstateServiceBean
// version : 1.0
// task : create
// edit by : khawkreab 
 */
package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.PawnshopEstate;
import service.PawnshopEstateService;

@Stateless
@Remote(PawnshopEstateService.class)
public class PawnshopEstateServiceBean implements PawnshopEstateService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(PawnshopEstate pawnshopEstate) {
		this.em.persist(pawnshopEstate);
		
	}

	@Override
	public PawnshopEstate findPawnshopEstateById(long pawnshopEstateId) {
		return this.em.find(PawnshopEstate.class, pawnshopEstateId);
	}

	@Override
	public void update(PawnshopEstate pawnshopEstate) {
		this.em.merge(pawnshopEstate);
		
	}

	@Override
	public void delete(long pawnshopEstateId) {
		PawnshopEstate pawnshopEstate = findPawnshopEstateById(pawnshopEstateId);
		if (pawnshopEstate != null) {
			em.remove(pawnshopEstate);
		}
		
	}

	@Override
	public List<PawnshopEstate> getAllPawnshopEstate() {
		return em.createQuery("SELECT x FROM PawnshopEstate x").getResultList();
	}

	@Override
	public List<PawnshopEstate> findPawnshopEstate(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
