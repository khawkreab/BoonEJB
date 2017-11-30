package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Gold;
import entity.ProposePrice;
import service.ProposePriceService;

@Stateless
@Remote(ProposePriceService.class)
public class ProposePriceServiceBean implements ProposePriceService{
	
	@PersistenceContext(unitName = "employeeDatabase")
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
	public ProposePrice findProposePriceById(long proposePriceId) {
		return this.em.find(ProposePrice.class, proposePriceId);
	}

	@Override
	public void delete(long proposePriceId) {
		ProposePrice proposePrice = findProposePriceById(proposePriceId);
		if (proposePrice != null) {
			em.remove(proposePrice);
		}
	}

	@Override
	public List<ProposePrice> getAllProposePrice() {
		return em.createQuery("SELECT x FROM ProposePrice x").getResultList();
	}

	@Override
	public List<ProposePrice> findProposeByPawnshopId(long pawnshopId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM ProposePrice p WHERE p.pawnshopId.pawnshopId =:fn").setParameter("fn", pawnshopId).getResultList();	
	}

	@Override
	public ProposePrice findProposePriceId(long proposePriceId) {
		return (ProposePrice) em.createQuery("SELECT p FROM ProposePrice p WHERE p.proposePriceId =:id").setParameter("id", proposePriceId).getSingleResult();
	}

	@Override
	public List<ProposePrice> listProposeBygold(long goldId) {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT p FROM ProposePrice p WHERE p.goldId.goldId =:id").setParameter("id", goldId).getResultList();

	}
}
