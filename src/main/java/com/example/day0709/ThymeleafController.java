package com.example.day0709;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("h2", "굿굿 베리");
        model.addAttribute("h3", 35);
        model.addAttribute("h4","꾹꾹이");
        model.addAttribute("h5","프로젝트 생각");
        model.addAttribute("p1", "책쓰기 도전해볼까");
        return "index";
    }
}
