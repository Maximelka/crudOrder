package nc.crud.service;

import nc.crud.model.Order;
import nc.crud.model.Point;

public interface OrderService {

    Order getOrder(int orderId);

    void createOrder(Order order);

    void updateOrder(Order order, int id);

    void deleteOrder(int id);
}
