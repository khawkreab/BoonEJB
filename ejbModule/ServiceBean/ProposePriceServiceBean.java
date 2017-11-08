package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import entity.ProposePrice;
import service.ProposePriceService;

@Stateless
@Remote(ProposePriceService.class)
public class ProposePriceServiceBean implements ProposePriceService{
	@PersistenceContext(unitName = "proposepriceDatabase")
	EntityManager em;
	
	@Override
	public void insert(ProposePrice proposePrice) {
		this.em.persist(proposePrice);
	}

	@Override
	public void update(ProposePrice proposePrice) {
		this.em.merge(proposePrice);
	}

	@Override
	public ProposePrice findProposePrice(long proposePriceId) {
		return this.em.find(ProposePrice.class, proposePriceId);
	}

	@Override
	public void delete(long proposePriceId) {
		ProposePrice proposePrice = findProposePrice(proposePriceId);
		if (proposePrice != null) {
			em.remove(proposePrice);
		}
	}

	@Override
	public List<ProposePrice> getAllProposePrice() {
		return em.createQuery("SELECT x FROM ProposePrice x").getResultList();
	}

	@Override
	public ProposePrice ListPostByPawnShopId(long postId) {
		return (ProposePrice) em.createQuery("SELECT p FROM ProposePrice p WHERE p.proposePrice.postId =:id ").setParameter("id", postId).getSingleResult();
	}

	@Override
	public ProposePrice findProposePriceId(long proposePriceId) {
		return (ProposePrice) em.createQuery("SELECT p FROM ProposePrice p WHERE p.proposePriceId =:id").setParameter("id", proposePriceId).getSingleResult();
	}
}
