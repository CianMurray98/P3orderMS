package ie.atu.orderms;

import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {

    // Simulating a database with an in-memory map
    private final Map<String, Order> orderData = new HashMap<>();

    // Add necessary dependencies, such as Feign clients for communication with other microservices

    public void createOrder(Order order) {
        orderData.put(order.getOrderId(), order);
        System.out.println("Order created: " + order);
        // Additional logic for interacting with other microservices if needed
    }

    public Order getOrderById(String orderId) {
        return orderData.get(orderId);
    }

    // Additional methods for updating or deleting orders
}