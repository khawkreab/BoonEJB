package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Timepiece;
import service.TimepieceService;;

@Stateless
@Remote(TimepieceService.class)
public class TimepieceServiceBean implements TimepieceService{

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(Timepiece timepiece) {
		// TODO Auto-generated method stub
		this.em.persist(timepiece);
	}

	@Override
	public Timepiece findTimepieceById(long timepieceId) {
		// TODO Auto-generated method stub
		return this.em.find(Timepiece.class, timepieceId);
	}

	@Override
	public void update(Timepiece timepiece) {
		// TODO Auto-generated method stub
		this.em.merge(timepiece);
	}

	@Override
	public void delete(long timepieceId) {
		// TODO Auto-generated method stub
		Timepiece pm = findTimepieceById(timepieceId);
		if(pm != null){
			this.em.remove(pm);
		}
	}

	@Override
	public List<Timepiece> getAllTimepiece() {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT x FROM Timepiece x").getResultList();
	}

	@Override
	public List<Timepiece> findTimepieceName(String timepiecename) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT pm FROM Timepiece pm WHERE pm.timepiecename LIKE :fn").setParameter("fn", timepiecename + "%").getResultList();
	}

	@Override
	public List<Timepiece> findTimepieceByPawnerId(long pawnerId) {
		// TODO Auto-generated method stub
		return this.em.createQuery("SELECT p FROM Timepiece p WHERE p.pawnerId.pawnerId =:fn").setParameter("fn", pawnerId).getResultList();	
	}

}
