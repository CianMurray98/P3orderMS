package ie.atu.orderms;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderItem {

    @NotBlank(message = "Menu item ID cannot be blank")
    private String menuItemId;

    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    @NotNull(message = "Price cannot be null")
    private BigDecimal price;

    // Add other attributes as needed
}