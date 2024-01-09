package ie.atu.orderms;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.List;

@Data
public class Order {

    @NotBlank(message = "ie.atu.orderms.Order ID cannot be blank")
    private String orderId;

    @NotBlank(message = "Customer ID cannot be blank")
    private String customerId;

    @NotNull(message = "ie.atu.orderms.Order items cannot be null")
    private List<OrderItem> orderItems;

    // Add other attributes as needed
}