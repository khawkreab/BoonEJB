package service;

import java.util.List;

import entity.Picture;


public interface PictureService {
	public void insert(Picture picture);
	public Picture findPawnerPostPictureById(long pictureId);
	public void update(Picture picture);
	public void delete(long pictureId);
	public List<Picture> getAllPicture();
	public List<Picture> findPictureByPawnerPostId(long pawnerPostId);
	public List<Picture> findPictureByPawnerId(long pawnerId);
	public List<Picture> findPictureByPawnshopId(long pawnshopId);
	public List<Picture> findPictureByPawnshopPostId(long pawnshopPostId);
}

