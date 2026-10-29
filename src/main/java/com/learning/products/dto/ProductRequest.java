package com.learning.products.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ProductRequest(
        @NotBlank @Size(max = 120) String name,
        @Size(max = 1000) String description,
        @NotNull @DecimalMin("0.0")
        BigDecimal price,
        @NotNull @Min(0) Integer stock
) {
}
