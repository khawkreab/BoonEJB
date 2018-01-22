package service;

import java.util.List;

import entity.Estimate;

public interface EstimateService {

	public void insert(Estimate estimate);

	public void update(Estimate estimate);

	public Estimate findEstimateById(long estimateId);

	public void delete(long estimateId);

	public List<Estimate> getAllEstimate();

	public List<Estimate>findEstimateByPawnshopId(long pawnshopId);

	public List<Estimate> listEstimateByPawnerPost(long pawnerPostId);
}
