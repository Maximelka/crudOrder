package nc.crud.controller;

import nc.crud.service.OrderService;
import nc.crud.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/{orderId:\\d+}")
    public Order getOrder(@PathVariable int orderId) {
        return orderService.getOrder(orderId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCar(@Valid @RequestBody Order requestOrder) {
        Order order = new Order();
        orderService.createOrder(requestOrder);
    }

    @PutMapping(value = "/{orderId:\\d+}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCar(
            @Valid @RequestBody Order requestOrder,
            @PathVariable int orderId
    ) {
        orderService.updateOrder(requestOrder, orderId);
    }

    @DeleteMapping(value = "/{orderId:\\d+}")
    public void deleteProfile(@PathVariable int orderId) {
        orderService.deleteOrder(orderId);
    }
}
