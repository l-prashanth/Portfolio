package com.prashanth.portfolio.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final List<String> backendSkills = new ArrayList<>(Arrays.asList(
            "Spring Boot",
            "Java",
            "REST API",
            "JUnit",
            "Karate",
            "MongoDB",
            "Azure Cloud",
            "Spring Security",
            "JWT",
            "Git",
            "Swagger"
    ));
    public static final List<String> frontendSkills = new ArrayList<>(Arrays.asList(
            "VueJS",
            "JavaScript",
            "HTML",
            "Jest",
            "Thymeleaf"
    ));
    public static final List<String> problemsSolved = new ArrayList<>(List.of("Solved challenges like:"));
    public static final List<String> problemsSolvedList = new ArrayList<>(Arrays.asList(
            "Proposed and implemented handling application failures such as downtime using Resilience4j.<br>" +
                    " This led to a significant cost reduction by replacing the need for extensive production support of " +
                    "the application",
            "> Solved the problem of sending data to automation test scripts by using HtmlUnit to <br>" +
                    "programmatically fill out web forms and use the captured data in the automation test Scripts.",
            "> Implemented Azure Service Bus queues to record failed API’s requests"
    ));
    public static final List<String> utilityPackage = new ArrayList<>(List.of("Developed a versatile utility package for seamless integration into the codebase,<br>" +
            "encompassing essential features like"));
    public static final List<String> utilityPackageList = new ArrayList<>(Arrays.asList(
            "> Dynamic null object (String, Integer handlers",
            "> Optional to String converters",
            "> Environment identifiers",
            "> JSON Handler/Convertor",
            "> Azure Key Vault retrieval"
    ));
    public static final List<String> problemsSolvedListCtd = new ArrayList<>(Arrays.asList(
            "Also implemented, multithreading for parallel API calls, JWT authentication",
            "Implemented custom exception handling mechanisms"
    ));


}
