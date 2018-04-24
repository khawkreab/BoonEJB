package service;

import java.util.List;

import entity.PawnerPost;


public interface PawnerPostService {
	public PawnerPost insert(PawnerPost pawnerPost);
	public PawnerPost findPostById(long pawnerPostId);
	public void update(PawnerPost pawnerPost);
	public void delete(long pawnerPostId);
	public List<PawnerPost> getAllPawnerPost();
	public List<PawnerPost> findPawnerPostName(String postName);
	public List<PawnerPost> findPawnerPostByPawnerId(long pawnerId);
	public List<PawnerPost> findPawnerPostByPawnerIdAndStatus(long pawnerId , String status);
	public List<PawnerPost> findPawnerPostByPawnshopId(long pawnshopId);
	
	public void updateStatus(long pawnerPostId, String staus);
	public PawnerPost findPawnerPostByStatus(String status);
	
	public void updatePicture(long pawnerPostId, String picture);
	}

