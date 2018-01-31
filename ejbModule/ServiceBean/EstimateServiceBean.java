/*!-- 
// page : EstimateServiceBean
// version : 1.0
// task : add find by pawnerId
// edit by : khawkreab
 --*/

package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Estimate;
import service.EstimateService;


@Stateless
@Remote(EstimateService.class)
public class EstimateServiceBean implements EstimateService{
	
	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;
	
	@Override
	public void insert(Estimate estimate) {
		this.em.persist(estimate);
	}

	@Override
	public void update(Estimate estimate) {
		this.em.merge(estimate);
	}

	@Override
	public Estimate findEstimateById(long estimateId) {
		return this.em.find(Estimate.class, estimateId);
	}

	@Override
	public void delete(long estimateId) {
		Estimate estimate = findEstimateById(estimateId);
		if (estimate != null) {
			em.remove(estimate);
		}
	}

	@Override
	public List<Estimate> getAllEstimate() {
		return em.createQuery("SELECT x FROM Estimate x").getResultList();
	}

	@Override
	public List<Estimate> findEstimateByPawnshopId(long pawnshopId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Estimate p WHERE p.pawnshopId.pawnshopId =:pawnshopId").setParameter("pawnshopId", pawnshopId).getResultList();	
	}

	@Override
	public List<Estimate> listEstimateByPawnerPost(long pawnerPostId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Estimate p WHERE p.pawnerPostId.pawnerPostId =:pawnerPostId").setParameter("pawnerPostId", pawnerPostId).getResultList();	
	}

	@Override
	public List<Estimate> listEstimateByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Estimate p WHERE p.pawnerId.pawnerId =:pawnerId").setParameter("pawnerId", pawnerId).getResultList();	

	}
}
