package nc.crud.repository;

import nc.crud.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderDao extends JpaRepository<Order, Integer> {

}
