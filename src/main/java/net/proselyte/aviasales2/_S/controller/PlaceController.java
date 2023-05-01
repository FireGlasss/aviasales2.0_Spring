package net.proselyte.aviasales2._S.controller;

import net.proselyte.aviasales2._S.model.Place;
import net.proselyte.aviasales2._S.model.User;
import net.proselyte.aviasales2._S.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PlaceController {
    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/places")
    public String findAll(Model model) {
        return "users";
    }

    @GetMapping("/place-create")
    public String createPlaceFrom(Place place) {
        return "addpolet";
    }

    @PostMapping("/place-create")
    public String createUser(Place place) {
        placeService.savePlace(place);
        return "redirect:/place-create";
    }
}
