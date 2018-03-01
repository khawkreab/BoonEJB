/*!-- 
// page : OrderServiceBean
// version : 1.0
// task : create
// edit by : khawkreab
 --*/

package ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.OrderItem;
import service.OrderItemService;


@Stateless
@Remote(OrderItemService.class)
public class OrderItemServiceBean implements OrderItemService {

	@PersistenceContext(unitName = "employeeDatabase")
	EntityManager em;

	@Override
	public void insert(OrderItem orderItem) {
		this.em.persist(orderItem);
		
	}

	@Override
	public void update(OrderItem orderItem) {
		this.em.merge(orderItem);
		
	}

	@Override
	public OrderItem findorderItemById(long orderItemId) {
		return this.em.find(OrderItem.class, orderItemId);
	}

	@Override
	public void delete(long orderItemId) {
		OrderItem pm = findorderItemById(orderItemId);
		if(pm != null){
			this.em.remove(pm);
		}
		
	}

	@Override
	public List<OrderItem> getAllorderItem() {
		return this.em.createQuery("SELECT c FROM OrderItem c").getResultList();
	}



	
}
