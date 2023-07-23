package com.system.TourBookingSystem.controller;

import com.system.TourBookingSystem.model.Destination;
import com.system.TourBookingSystem.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DestinationController {

    private final DestinationService destinationService;

    @Autowired
    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }

    @GetMapping("/destinations")
    public String showDestinations(Model model) {
        List<Destination> destinations = destinationService.getAllDestinations();
        model.addAttribute("destinations", destinations);
        return "destination";
    }

    @PostMapping("/destinations")
    public String addDestination(@RequestParam String name) {
        Destination destination = new Destination();
        destination.setName(name);
        destinationService.saveDestination(destination);
        return "redirect:/destinations";
    }
}
