package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadcarform(Model model) {
        model.addAttribute("carform", new Car());
        return "carform";
    }

    @PostMapping("/carform")
    public String processcarform(@Valid Car car, BindingResult result){
        if(result.hasErrors()){
            return "carform";
        }
        return "carconfirm";
    }
}
