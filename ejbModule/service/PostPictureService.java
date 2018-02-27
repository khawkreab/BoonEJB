/*!-- 
// page : PostPictureService
// version : 1.0
// task : create
// edit by : khawkreab
 --*/

package service;

import java.util.List;

import entity.PostPicture;


public interface PostPictureService {

	public void insert(PostPicture PostPictureId);

	public void update(PostPicture PostPictureId);

	public PostPicture findPostPictureById(long PostPictureId);

	public void delete(long PostPictureId);

	public List<PostPicture> getAllPostPicture();

	public List<PostPicture> findPostPictureByPawnshopId(long pawnshopId);


	

}
