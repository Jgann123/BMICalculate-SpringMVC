package com.bmi.calculatebmi.bmicontrollers;

import com.bmi.calculatebmi.bmimodels.bmiInput;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/home" })
public class homeController {

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("bmiInput", new bmiInput());

        // The string index will be looked for in src/main/resources/templates
        return "index";
    }

        // Remember Ctrl + Shift + O (Mac: Command + Shift + O) to auto import
    @PostMapping("/bmiInput")
    public String bmiInputSubmit(@ModelAttribute bmiInput bmiInput) {
        return "result";
    }
}