package com.prashanth.portfolio.controller;

import com.prashanth.portfolio.model.Page;
import com.prashanth.portfolio.model.Project;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
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
//        pageRepository.findById(0).get().setTitle();
//        Page pages = new Page();
//        for(int i = 0;i<3;i++){
//            pages.setTitle("Page 1");
//        }
//        pages.setTitle("Page 1");
        List<Page> pages = new ArrayList<>();
        pages.add(new Page("Overview", getAboutMeContent(),"/img/MyPic.jpg"));
        pages.add(new Page("Skills", "This is the skills content.",""));
//        pages.add(new Page("Experience", "This is the experience content.",""));
        pages.add(new Page("Projects", "This is the projects content.",""));
        pages.add(new Page("Certifications", "This is the certifications content.",""));
        pages.add(new Page("Achievements", "This is the achievements content.",""));
        pages.add(new Page("Problems Solved", "This is the problems solved content.",""));

        getSkills(model);
        getSolved(model);
        model.addAttribute("pages", pages);

        return "test1";
    }
    private void getSkills(Model model){
        List<String> backendSkills = new ArrayList<>();
        backendSkills.add("Spring Boot");
        backendSkills.add("Java");
        backendSkills.add("REST API");
        backendSkills.add("JUnit");
        backendSkills.add("Karate");
        backendSkills.add("MongoDB");
        backendSkills.add("Azure Cloud");
        backendSkills.add("Spring Security");
        backendSkills.add("JWT");
        backendSkills.add("Git");
        backendSkills.add("Swagger");

        List<String> frontendSkills = new ArrayList<>();
        frontendSkills.add("VueJS");
        frontendSkills.add("JavaScript");
        frontendSkills.add("HTML");
        frontendSkills.add("Jest");
        frontendSkills.add("Thymeleaf");

        model.addAttribute("backendSkills", backendSkills);
        model.addAttribute("frontendSkills", frontendSkills);
    }
    public void getSolved(Model model){
        List<String> problemsSolved = new ArrayList<>();
        List<String> problemsSolvedList = new ArrayList<>();
        problemsSolved.add("Solved challenges like:");
        problemsSolvedList.add("> Proposed and implemented handling application failures such as downtime using Resilience4j.");
        problemsSolvedList.add("> Solved the problem of sending data to " +
                "automation test scripts by using HtmlUnit to <br>" +
                "programmatically fill out web forms" +
                "and use the captured data in the automation test Scripts.");
        problemsSolvedList.add("> Implemented Azure Service Bus queues" +
                "to record failed API’s requests");
        model.addAttribute("problemsSolved", problemsSolved);
        model.addAttribute("problemsSolvedList", problemsSolvedList);

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
