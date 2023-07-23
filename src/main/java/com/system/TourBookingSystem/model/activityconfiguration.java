package com.system.TourBookingSystem.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Configuration
@Controller
public class activityconfiguration {
    @GetMapping("/adventure")
    public ResponseEntity<String> Adventure(){
            String url = "https://assets.traveltriangle.com/blog/wp-content/uploads/2020/02/Rock-Climbing-.jpg";
            return ResponseEntity.ok(url);
    }
    @GetMapping("/nature")
    public ResponseEntity<String> Nature(){
        String url = "https://area47.at/en/wp-content/uploads/2021/11/2022-area47-outdoor-canyoning-college.jpg";
        return ResponseEntity.ok(url);
    }
    @GetMapping("/hills")
    public ResponseEntity<String> HillStation(){
        String url = "https://img.traveltriangle.com/blog/wp-content/uploads/2018/07/br-hills-trekking-cover.jpg";
        return ResponseEntity.ok(url);
    }
}
