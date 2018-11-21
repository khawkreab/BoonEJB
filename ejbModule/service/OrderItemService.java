/*!-- 
// page : OrderService
// version : 2.0
// task : findOrderByPawnerId
// edit by : khawkreab
 --*/

package service;

import java.util.List;

import entity.OrderItem;


public interface OrderItemService {

	public void insert(OrderItem orderItem);

	public void update(OrderItem orderItem);

	public OrderItem findorderItemById(long orderItemId);

	public void delete(long orderItemId);

	public List<OrderItem> getAllorderItem();
	
	public List<OrderItem> findOrderByPawnerId(long pawnerId);

	public List<OrderItem> findOrderByPawnshopId(long pawnshopId);
}
