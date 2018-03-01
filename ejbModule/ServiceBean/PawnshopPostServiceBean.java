/* 
// page : PawnshopPostServiceBean
// version : 1.0
// task : create
// edit by : khawkreab 
 */
package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.PawnerPost;
import entity.PawnshopPost;
import service.PawnshopPostService;

@Stateless
@Remote(PawnshopPostService.class)
public class PawnshopPostServiceBean implements PawnshopPostService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(PawnshopPost pawnshopPost) {
		this.em.persist(pawnshopPost);
		
	}

	@Override
	public PawnshopPost findPawnshopPostById(long pawnshopPostId) {
		return this.em.find(PawnshopPost.class, pawnshopPostId);
	}

	@Override
	public void update(PawnshopPost pawnshopPost) {
		this.em.merge(pawnshopPost);
		
	}

	@Override
	public void delete(long pawnshopPostId) {
		PawnshopPost pawnshopPost = findPawnshopPostById(pawnshopPostId);
		if (pawnshopPost != null) {
			em.remove(pawnshopPost);
		}
		
	}

	@Override
	public List<PawnshopPost> getAllPawnshopPost() {
		return em.createQuery("SELECT x FROM PawnshopPost x").getResultList();
	}

	@Override
	public List<PawnshopPost> findPawnshopPost(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<PawnshopPost> findPawnshopPostByPawnshopId(long pawnshopId) {
		return this.em.createQuery("SELECT p FROM PawnshopPost p WHERE p.pawnshopId.pawnshopId =:pawnshopId ORDER BY p.pawnshopPostDate DESC").setParameter("pawnshopId", pawnshopId).getResultList();	
	}

}
