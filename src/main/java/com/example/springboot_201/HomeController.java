package com.example.springboot_201;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage() {
        return "formtemplate";
    }
    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login,
                                Model model) {
        model.addAttribute("loginval", login);
        return "confirm";
    }
}
