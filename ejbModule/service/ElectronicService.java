package service;

import java.util.List;

import entity.Electronic;

public interface ElectronicService {
	public void insert(Electronic electronic);
	public Electronic findElectronicById(long electronicId);
	public void update(Electronic electronic);
	public void delete(long electronicId);
	public List<Electronic> getAllElectronic();
	public List<Electronic> findElectronicName(String electronicname);
	public List<Electronic> findElectronicByPawnerId(long pawnerId);
}
