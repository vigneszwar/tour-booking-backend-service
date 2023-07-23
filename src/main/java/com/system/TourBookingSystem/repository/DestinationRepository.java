package com.system.TourBookingSystem.repository;

import com.system.TourBookingSystem.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
