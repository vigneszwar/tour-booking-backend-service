package com.system.TourBookingSystem.service;

import com.system.TourBookingSystem.model.Destination;

import java.util.List;

public interface DestinationService {
    Destination saveDestination(Destination destination);
    List<Destination> getAllDestinations();
}
