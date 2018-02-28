/*!-- 
// page : OrderService
// version : 1.0
// task : create
// edit by : khawkreab
 --*/

package service;

import java.util.List;

import entity.OrderItem;


public interface OrderService {

	public void insert(OrderItem orderItem);

	public void update(OrderItem orderItem);

	public OrderItem findorderItemById(long orderItemId);

	public void delete(long orderItemId);

	public List<OrderItem> getAllorderItem();

}
