package service;

import java.util.List;
import entity.Pawner;
import entity.PawnshopEstate;

public interface PawnshopEstateService {
	public void insert(PawnshopEstate pawnshopEstate);
	public PawnshopEstate findPawnshopEstateById(long pawnshopEstateId);
	public void update(PawnshopEstate pawnshopEstate);
	public void delete(long pawnshopEstateId);
	public List<PawnshopEstate> getAllPawnshopEstate();
	public List<PawnshopEstate> findPawnshopEstate(String name);

}
