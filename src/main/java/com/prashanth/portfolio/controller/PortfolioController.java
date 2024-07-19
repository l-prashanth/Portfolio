package com.prashanth.portfolio.controller;

import com.prashanth.portfolio.model.Page;
import com.prashanth.portfolio.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/portfolio")
    public String home(Model model) {
        // Add model attributes for portfolio content
        model.addAttribute("aboutMe", getAboutMeContent());
        model.addAttribute("skills", getSkillsContent());
        model.addAttribute("projects", getProjectsContent());
//        model.addAttribute("toolsTechnologies", getToolsTechnologiesContent());
//        model.addAttribute("achievements", getAchievementsContent());
//        model.addAttribute("contactInfo", getContactInfoContent());
//        model.addAttribute("references", getReferencesContent());

        return "test";
    }
    @GetMapping("/x")
    public String getPages(Model model) {
        List<Page> pages = new ArrayList<>();
        pages.add(new Page("Page 1", "This is the content of Page 1."));
        pages.add(new Page("Page 2", "This is the content of Page 2."));
        pages.add(new Page("Page 3", "This is the content of Page 3."));

        model.addAttribute("pages", pages);
        return "test1";
    }

    private String getAboutMeContent() {
        return "I am a skilled web developer with expertise in Spring Boot and Thymeleaf. I have a strong background in building robust, scalable, and maintainable web applications.";
    }

    private List<String> getSkillsContent() {
        return Arrays.asList(
                "Spring Boot",
                "Thymeleaf",
                "Java",
                "Database Management",
                "Web Development"
        );
    }

    private List<Project> getProjectsContent() {
        return Arrays.asList(
                new Project(
                        "E-commerce Application",
                        "A full-fledged e-commerce application built using Spring Boot and Thymeleaf.",
                        Arrays.asList(
                                "User registration and login",
                                "Product catalog with filtering and sorting",
                                "Cart management with item addition and removal",
                                "Order management with payment processing",
                                "Integration with MySQL database"
                        ),
                        Arrays.asList(
                                "Spring Boot",
                                "Thymeleaf",
                                "MySQL",
                                "HTML",
                                "CSS",
                                "JavaScript"
                        )
                )
                // Add more projects as needed
        );
    }

    // Add more helper methods to populate other sections of the portfolio
}
