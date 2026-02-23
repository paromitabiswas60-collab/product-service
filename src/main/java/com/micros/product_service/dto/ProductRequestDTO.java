package com.micros.product_service.dto;

import java.math.BigDecimal;
import java.util.spi.ToolProvider;

public class ProductRequestDTO {

    private String name;
    private String description;
    private BigDecimal price;

    public ProductRequestDTO() {
    }

    public ProductRequestDTO(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public static ToolProvider builder() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}