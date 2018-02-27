/*!-- 
// page : PostPictureServiceBean
// version : 1.0
// task : create
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
public class PostPictureServiceBean implements EstimateService {

	@Override
	public void insert(Estimate estimate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Estimate estimate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estimate findEstimateById(long estimateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long estimateId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estimate> getAllEstimate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estimate> findEstimateByPawnshopId(long pawnshopId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estimate> listEstimateByPawnerPost(long pawnerPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estimate> findEstimateByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStatus(long pawnerPostId, String staus) {
		// TODO Auto-generated method stub
		
	}

	
}
