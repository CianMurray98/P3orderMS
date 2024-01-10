package ie.atu.orderms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderDataInitializer implements CommandLineRunner {

    private final OrderService orderService;

    @Autowired
    public OrderDataInitializer(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and save dummy orders
        Order order1 = new Order();
        order1.setCustomerId("ID0001");
        order1.setItemId("ITEM0001");
        order1.setName("Cian Murray");
        order1.setQuantity(2);
        order1.setPrice(new BigDecimal("15.99"));

        Order order2 = new Order();
        order2.setCustomerId("ID0002");
        order2.setItemId("ITEM0002");
        order2.setName("Aoife Lally");
        order2.setQuantity(1);
        order2.setPrice(new BigDecimal("20.50"));

        // Save orders to the database
        orderService.createOrder(order1);
        orderService.createOrder(order2);
    }
}