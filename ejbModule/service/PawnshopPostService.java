package service;

import java.util.List;

import entity.PawnshopPost;

public interface PawnshopPostService {
	public PawnshopPost insert(PawnshopPost pawnshopPost);
	public PawnshopPost findPawnshopPostById(long pawnshopPostId);
	public void update(PawnshopPost pawnshopPost);
	public void delete(long pawnshopPostId);
	public List<PawnshopPost> getAllPawnshopPost();
	public List<PawnshopPost> findPawnshopPost(String name);
	public List<PawnshopPost> findPawnshopPostByPawnshopId(long pawnshopId);
	public List<PawnshopPost> listPawnshopPostByPawnerId(long pawnerId);
	
	public void updatePicture(long pawnshopPostId, String picture);


}
