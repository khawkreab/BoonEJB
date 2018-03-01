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
import service.PawnerPostService;

@Stateless
@Remote(PawnerPostService.class)
public class PawnerPostServiceBean implements PawnerPostService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(PawnerPost pawnerPostId) {
		// TODO Auto-generated method stub
		this.em.persist(pawnerPostId);
	}

	@Override
	public PawnerPost findPostById(long pawnerPostId) {
		// TODO Auto-generated method stub
		return this.em.find(PawnerPost.class, pawnerPostId);
	}


	@Override
	public void update(PawnerPost pawnerPostId) {
		// TODO Auto-generated method stub
		this.em.merge(pawnerPostId);
	}

	@Override
	public void delete(long postId) {
		// TODO Auto-generated method stub
		PawnerPost pm = findPostById(postId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<PawnerPost> getAllPawnerPost() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT c FROM Post c").getResultList();
	}

	@Override
	public List<PawnerPost> findPawnerPostName(String postName) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM PawnerPost p WHERE p.pawnerPostItemType LIKE :postName").setParameter("postName", postName + "%").getResultList();
	}

	@Override
	public List<PawnerPost> findPawnerPostByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM PawnerPost p WHERE p.pawnerId.pawnerId =:pawnerId ORDER BY p.pawnerPostDate").setParameter("pawnerId", pawnerId).getResultList();	
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

}
