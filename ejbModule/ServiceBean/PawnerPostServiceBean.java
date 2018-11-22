/* 
// page : PawnerPostServiceBean
// version : 1.1
// task : �� findPawnerPostByPawnshopId error 
// edit by : khawkreab 
 */
package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Pawner;
import entity.PawnerPost;
import service.PawnerPostService;

@Stateless
@Remote(PawnerPostService.class)
public class PawnerPostServiceBean implements PawnerPostService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public PawnerPost insert(PawnerPost pawnerPost) {
		this.em.persist(pawnerPost);
		em.flush();
		return pawnerPost;
	}

	@Override
	public PawnerPost findPostById(long pawnerPostId) {
		return this.em.find(PawnerPost.class, pawnerPostId);
	}


	@Override
	public void update(PawnerPost pawnerPost) {
		this.em.merge(pawnerPost);
	}

	@Override
	public void delete(long postId) {
		PawnerPost pm = findPostById(postId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<PawnerPost> getAllPawnerPost() {
		return this.em.createQuery("SELECT c FROM PawnerPost c ORDER BY c.pawnerPostDate DESC").getResultList();
	}

	@Override
	public List<PawnerPost> findPawnerPostName(String postName) {
		return this.em.createQuery("SELECT p FROM PawnerPost p WHERE p.pawnerPostItemType LIKE :postName").setParameter("postName", postName + "%").getResultList();
	}

	@Override
	public List<PawnerPost> findPawnerPostByPawnerId(long pawnerId) {
		return this.em.createQuery("SELECT p FROM PawnerPost p WHERE p.pawnerId.pawnerId =:pawnerId ORDER BY p.pawnerPostDate DESC").setParameter("pawnerId", pawnerId).getResultList();	
	}

	@Override
	public List<PawnerPost> findPawnerPostByPawnshopId(long pawnshopId) {
		return this.em.createQuery("SELECT p FROM PawnerPost p WHERE p.pawnerPostId NOT IN (SELECT c.pawnerPostId.pawnerPostId FROM Estimate c WHERE c.pawnshopId.pawnshopId =:pawnshopId ) ORDER BY p.pawnerPostDate DESC").setParameter("pawnshopId", pawnshopId).getResultList();	
	}

	@Override
	public void updateStatus(long pawnerPostId, String staus) {
		em.createQuery("update PawnerPost s set s.pawnerPostStatus =:staus WHERE s.pawnerPostId =:pawnerPostId" 
				).setParameter("pawnerPostId", pawnerPostId).setParameter("staus", staus).executeUpdate();
		
	}

	@Override
	public PawnerPost findPawnerPostByStatus(String status) {
		return (PawnerPost) this.em.createQuery("SELECT p FROM PawnerPost p WHERE p.pawnerPostStatus =:status").setParameter("status", status).getSingleResult();
	}

	@Override
	public void updatePicture(long pawnerPostId, String picture) {
		em.createQuery("update PawnerPost s set s.pawnerPostPicture =:picture WHERE s.pawnerPostId =:pawnerPostId" 
				).setParameter("pawnerPostId", pawnerPostId).setParameter("picture", picture).executeUpdate();
	}

	@Override
	public List<PawnerPost> findPawnerPostByPawnerIdAndStatus(long pawnerId, String status) {
		// TODO Auto-generated method stub
		return this.em.createQuery(
				"SELECT p FROM PawnerPost p WHERE p.pawnerId.pawnerId =:pawnerId AND p.pawnerPostStatus =:status ORDER BY p.pawnerPostDate DESC")
				.setParameter("pawnerId", pawnerId).setParameter("status", status).getResultList();
	}

}
