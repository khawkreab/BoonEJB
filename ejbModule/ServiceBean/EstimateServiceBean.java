/*!-- 
// page : EstimateServiceBean
// version : 2.0
// task : add updateStatus
// edit by : khawkreab
 --*/

package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Estimate;
import entity.Pawnshop;
import service.EstimateService;

@Stateless
@Remote(EstimateService.class)
public class EstimateServiceBean implements EstimateService {

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
		return em.createQuery("SELECT c FROM Estimate c").getResultList();
	}

	@Override
	public List<Estimate> findEstimateByPawnshopId(long pawnshopId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Estimate p WHERE p.pawnshopId.pawnshopId =:pawnshopId")
				.setParameter("pawnshopId", pawnshopId).getResultList();
	}

	@Override
	public List<Estimate> listEstimateByPawnerPost(long pawnerPostId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Estimate p WHERE p.pawnerPostId.pawnerPostId =:pawnerPostId")
				.setParameter("pawnerPostId", pawnerPostId).getResultList();
	}

	@Override
	public List<Estimate> findEstimateByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery(
				"SELECT c FROM Estimate c WHERE c.pawnerPostId.pawnerPostId IN (SELECT p.pawnerPostId FROM PawnerPost p WHERE p.pawnerId.pawnerId =:pawnerId)")
				.setParameter("pawnerId", pawnerId).getResultList();
	}

	@Override
	public void updateStatus(long pawnerPostId, String staus) {
		// TODO Auto-generated method stub
		em.createQuery(
				"update Estimate s set s.estimateStatus =:staus WHERE s.pawnerPostId.pawnerPostId =:pawnerPostId")
				.setParameter("pawnerPostId", pawnerPostId).setParameter("staus", staus).executeUpdate();

	}

	@Override
	public List<Estimate> findEstimateByPawnerIdAndStatus(long pawnerId, String status) {
		// TODO Auto-generated method stub
		return this.em.createQuery(
				"SELECT c FROM Estimate c WHERE c.pawnerPostId.pawnerPostId IN (SELECT p.pawnerPostId FROM PawnerPost p WHERE p.pawnerId.pawnerId =:pawnerId) AND c.estimateStatus =:status ")
				.setParameter("pawnerId", pawnerId).setParameter("status", status).getResultList();
	}

	@Override
	public List<Estimate> findEstimateByPawnshopIdAndStatus(long pawnshopId, String status) {
		return this.em.createQuery("SELECT c FROM Estimate c WHERE c.pawnshopId.pawnshopId =:pawnshopId AND c.estimateStatus =:status").setParameter("pawnshopId", pawnshopId).setParameter("status", status).getResultList();
		
	}
}
