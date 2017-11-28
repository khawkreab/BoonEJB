package service;

import java.util.List;

import entity.Jewelry;

public interface JewelryService {
	public void insert(Jewelry jewelry);
	public Jewelry findJewelryById(long jewelryId);
	public void update(Jewelry jewelry);
	public void delete(long jewelryId);
	public List<Jewelry> getAllJewelry();
	public List<Jewelry> findJewelryName(String jewelryname);
	public List<Jewelry> findJewelryByPawnerId(long pawnerId);
}
