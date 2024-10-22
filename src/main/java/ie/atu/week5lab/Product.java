package ie.atu.week5lab;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotNull(message="This value can not be 0")
    private int id;
    @NotBlank(message="This field can not be blank")
    private String name;
    @Positive(message="Price has to be greater than 0")
    private double price;

}
