package com.system.TourBookingSystem.model;

//package com.example.tour booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/packages")
@Configuration
public class PackageController {

    @Autowired
    private PackageRepository packageRepository;

    public PackageController(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    // Define methods to handle HTTP requests here
    // ...
}
