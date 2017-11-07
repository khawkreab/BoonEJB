package service;

import java.util.List;

import entity.Gold;

public interface GoldService {
	public void insert(Gold gold);
	public Gold findGoldById(long goldId);
	public void update(Gold gold);
	public void delete(long goldId);
	public List<Gold> getAllGold();
	public List<Gold> findGoldName(String goldname);
}

