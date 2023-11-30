package com.thiagobrito.authapi.domain.product;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(@NotBlank String name, @NotNull BigDecimal price, @NotNull Integer quantity) {
}
