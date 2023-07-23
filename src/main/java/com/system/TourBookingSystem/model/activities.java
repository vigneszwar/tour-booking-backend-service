package com.system.TourBookingSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class activities {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String act_name;
    private long price;
    private String Descriptionn;
    private String image;
}
