/*!-- 
// page : EstimateService
// version : 2.0
// task : add updateStatus
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

	public List<Estimate> findEstimateByPawnerId(long pawnerId);
	
	public List<Estimate> findEstimateByPawnerIdAndStatus(long pawnerId , String status);
	
	public List<Estimate> findEstimateByPawnshopIdAndStatus(long pawnshopId , String status);
	

	public void updateStatus(long pawnerPostId, String staus);
}
