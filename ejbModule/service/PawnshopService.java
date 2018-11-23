package service;

import java.util.List;


import entity.Pawnshop;

public interface PawnshopService {
	public void insert(Pawnshop pawnshop);
	public Pawnshop findPawnshopById(long pawnshopId);
	public void update(Pawnshop pawnshop);
	public void delete(long pawnshopId);
	public List<Pawnshop> getAllPawnshop();
	public List<Pawnshop> findPawnshopName(String name);
	public List<Pawnshop> findPawnshopEmail(String email);
	public Pawnshop findPawnShopByEmailAndPassword(String email, String password);
	public void updatePawnshopState(long pawnshopId, String status);
}
