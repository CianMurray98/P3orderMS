package ie.atu.orderms;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void createOrder(Order order) {
        orderRepo.save(order);
        // Additional logic for interacting with other microservices if needed
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Optional<Order> getOrderById(Long orderId) {
        return orderRepo.findById(orderId);
    }

    public void updateOrder(Order order) {
        orderRepo.save(order);
    }

    public void deleteOrderById(Long orderId) {
        orderRepo.deleteById(orderId);
    }
}
