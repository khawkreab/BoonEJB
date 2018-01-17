package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Post;
import service.PostService;;

@Stateless
@Remote(PostService.class)
public class PostServiceBean implements PostService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Post post) {
		// TODO Auto-generated method stub
		this.em.persist(post);
	}

	@Override
	public Post findPostById(long postId) {
		// TODO Auto-generated method stub
		return this.em.find(Post.class, postId);
	}

	@Override
	public void update(Post post) {
		// TODO Auto-generated method stub
		this.em.merge(post);
	}

	@Override
	public void delete(long postId) {
		// TODO Auto-generated method stub
		Post pm = findPostById(postId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT x FROM Post x").getResultList();
	}

	@Override
	public List<Post> findPostName(String item1) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT pm FROM Post pm WHERE pm.item1 LIKE :fn").setParameter("fn", item1 + "%").getResultList();
	}

	@Override
	public List<Post> findPostByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Post p WHERE p.pawnerId.pawnerId =:fn").setParameter("fn", pawnerId).getResultList();	
	}

}
