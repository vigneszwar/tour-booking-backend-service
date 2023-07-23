package com.system.TourBookingSystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Controller
public class Package {
    private Long id;

    private String destination;
    private String description;
    private double price;

    public Package(String destination, String description, double price) {
        this.destination = destination;
        this.description = description;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Optional: toString method for a readable string representation
    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
