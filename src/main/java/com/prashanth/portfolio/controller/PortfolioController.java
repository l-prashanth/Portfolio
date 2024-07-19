package com.prashanth.portfolio.controller;

import com.prashanth.portfolio.model.Page;

import com.prashanth.portfolio.service.PortfolioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class PortfolioController {
    private final PortfolioService portfolioService;

    @GetMapping("/portfolio")
    public String home(Model model) {
        return "test";
    }
    @GetMapping("/x")
    public String getPages(Model model) {
        List<Page> pages = new ArrayList<>();
        pages.add(new Page("Overview", "","/img/MyPic.jpg"));
        pages.add(new Page("Skills", "This is the skills content.",""));
        pages.add(new Page("Projects", "This is the projects content.",""));
        pages.add(new Page("Certifications", "This is the certifications content.",""));
        pages.add(new Page("Achievements", "This is the achievements content.",""));
        pages.add(new Page("Problems Solved", "This is the problems solved content.",""));
        portfolioService.getSkills(model);
        portfolioService.getSolved(model);
        model.addAttribute("pages", pages);

        return "test1";
    }
}
