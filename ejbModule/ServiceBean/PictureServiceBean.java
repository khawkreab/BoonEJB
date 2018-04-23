/* 
// page : PawnerPostServiceBean
// version : 1.1
// task : แก้ findPawnerPostByPawnshopId error 
// edit by : khawkreab 
 */
package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.PawnerPost;
import entity.Picture;
import service.PictureService;


@Stateless
@Remote(PictureService.class)
public class PictureServiceBean implements PictureService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Picture picture) {
		this.em.persist(picture);
		
	}

	@Override
	public Picture findPictureById(long pictureId) {
		return this.em.find(Picture.class, pictureId);
	}

	@Override
	public void update(Picture picture) {
		this.em.merge(picture);
		
	}

	@Override
	public void delete(long pictureId) {
		Picture pp = findPictureById(pictureId);
		if(pp != null){
			this.em.remove(pp);
		}
		
	}

	@Override
	public List<Picture> getAllPicture() {
		return this.em.createQuery("SELECT c FROM Picture c").getResultList();
	}

	@Override
	public List<Picture> findPictureByPawnerPostId(long pawnerPostId) {
		return this.em.createQuery("SELECT p FROM Picture p WHERE p.pawnerPostId.pawnerPostId =:pawnerPostId").setParameter("pawnerPostId", pawnerPostId).getResultList();
	}

	@Override
	public List<Picture> findPictureByPawnerId(long pawnerId) {
		return this.em.createQuery("SELECT p FROM Picture p WHERE p.pawnerId.pawnerId =:pawnerId").setParameter("pawnerId", pawnerId).getResultList();
	}

	@Override
	public List<Picture> findPictureByPawnshopId(long pawnshopId) {
		return this.em.createQuery("SELECT p FROM Picture p WHERE p.pawnshopId.pawnshopId =:pawnshopId").setParameter("pawnshopId", pawnshopId).getResultList();
	}

	@Override
	public List<Picture> findPictureByPawnshopPostId(long pawnshopPostId) {
		return this.em.createQuery("SELECT p FROM Picture p WHERE p.pawnshopPostId.pawnshopPostId =:pawnshopPostId").setParameter("pawnshopPostId", pawnshopPostId).getResultList();
	}

	
}
