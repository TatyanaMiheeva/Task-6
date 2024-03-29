package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {
   private final  CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5")int count, Model model){
        model.addAttribute("car", carServiceImp.limit(count));
        return "car";
    }
}
