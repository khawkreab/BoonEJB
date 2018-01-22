package service;

import java.util.List;
import entity.Pawner;

public interface PawnerService {
	public void insert(Pawner pawner);
	public Pawner findPawnerById(long pawnerId);
	public void update(Pawner pawner);
	public void delete(long pawmerId);
	public List<Pawner> getAllPawner();
	public List<Pawner> findPawnerFirstName(String name);
	public Pawner findPawnerByEmailAndPassword(String email, String password);

}
