package service;

import java.util.List;

import entity.ProposePrice;

public interface ProposePriceService {

	public void insert(ProposePrice proposePrice);

	public void update(ProposePrice proposePrice);

	public ProposePrice findProposePriceById(long proposePriceId);

	public void delete(long proposePriceId);

	public List<ProposePrice> getAllProposePrice();

	public ProposePrice ListPostByPawnShopId(long pawnShopId);

	public ProposePrice findProposePriceId(long proposePriceId);
}
