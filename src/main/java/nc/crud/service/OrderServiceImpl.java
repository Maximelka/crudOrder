package nc.crud.service;

import nc.crud.exception.OrderNotFoundException;
import nc.crud.model.Order;
import nc.crud.model.Point;
import nc.crud.repository.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;

    @Autowired
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public Order getOrder(int orderId) {
        return orderDao.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException(orderId));
    }

    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }

    @Override
    public void updateOrder(Order order, int id) {
        Order orderUpdate = orderDao.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(id));

        orderUpdate.setName(order.getName())
                .setStartPointLongitude(order.getStartPointLongitude())
                .setStartPointWidth(order.getStartPointWidth())
                .setEndPointLongitude(order.getEndPointLongitude())
                .setEndPointWidth(order.getEndPointWidth())
                .setStatus(order.getStatus());

        orderDao.save(orderUpdate);
    }

    @Override
    public void deleteOrder(int id) {
        Order order = orderDao.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(id));
        orderDao.delete(order);
    }

}
