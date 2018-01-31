/*!-- 
// page : EstimateService
// version : 1.0
// task : add find by pawnerId
// edit by : khawkreab
 --*/

package service;

import java.util.List;

import entity.Estimate;

public interface EstimateService {

	public void insert(Estimate estimate);

	public void update(Estimate estimate);

	public Estimate findEstimateById(long estimateId);

	public void delete(long estimateId);

	public List<Estimate> getAllEstimate();

	public List<Estimate> findEstimateByPawnshopId(long pawnshopId);

	public List<Estimate> listEstimateByPawnerPost(long pawnerPostId);

	public List<Estimate> listEstimateByPawnerId(long pawnerId);
}
