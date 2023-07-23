package com.system.TourBookingSystem.service;

import com.system.TourBookingSystem.model.Destination;
import com.system.TourBookingSystem.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationServiceImpl implements DestinationService {
    private final DestinationRepository destinationRepository;

    @Autowired
    public DestinationServiceImpl(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @Override
    public Destination saveDestination(Destination destination) {
        return destinationRepository.save(destination);
    }
}
