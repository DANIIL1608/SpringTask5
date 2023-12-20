package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getTableWithCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        if (count != null && count <= 5) {
            model.addAttribute("cars", carService.getCarsList(count));
        } else {
            model.addAttribute("cars", carService.getCarsList(5));
        }
        return "cars";
    }
}
