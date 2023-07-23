package com.system.TourBookingSystem.model;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class activitiescontroller {
    @GetMapping("/activities")
    public String displayactivities(Model model) {
        String adventureImageUrl = "https://assets.traveltriangle.com/blog/wp-content/uploads/2020/02/Rock-Climbing-.jpg";
        String natureImageUrl = "https://area47.at/en/wp-content/uploads/2021/11/2022-area47-outdoor-canyoning-college.jpg";
        String hillStationImageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2018/07/br-hills-trekking-cover.jpg";

        model.addAttribute("adventureImageUrl", adventureImageUrl);
        model.addAttribute("natureImageUrl", natureImageUrl);
        model.addAttribute("hillStationImageUrl", hillStationImageUrl);

        return "activities";
    }
}
