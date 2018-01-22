package service;

import java.util.List;

import entity.PawnerPost;


public interface PawnerPostService {
	public void insert(PawnerPost pawnerPostId);
	public PawnerPost findPostById(long pawnerPostId);
	public void update(PawnerPost pawnerPostId);
	public void delete(long pawnerPostId);
	public List<PawnerPost> getAllPawnerPost();
	public List<PawnerPost> findPawnerPostName(String postName);
	public List<PawnerPost> findPawnerPostByPawnerId(long pawnerId);
	public List<PawnerPost> findPawnerPostByPawnshopId(long pawnshopId);

}

