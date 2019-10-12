package hu.elte.restaurant.repository;

import hu.elte.restaurant.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{

}
