package com.prashanth.portfolio.constants;
import com.prashanth.portfolio.model.Page;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.prashanth.portfolio.constants.ProblemSolvedConstants.*;
@Data
public class Constants {
    public static final List<String> backendSkills = new ArrayList<>(Arrays.asList(
            "Spring Boot", "Java", "REST API", "JUnit", "Karate", "MongoDB",
            "Azure Cloud", "Spring Security", "JWT", "Git", "Swagger"));

    public static final List<String> frontendSkills = new ArrayList<>(Arrays.asList(
            "VueJS", "JavaScript", "HTML", "Jest", "Thymeleaf"));

    public static final List<String> problemsSolved = new ArrayList<>(List.of(heading));

    public static final List<String> problemsSolvedList = new ArrayList<>(Arrays.asList(
            problemsSolvedList1,problemsSolvedList2,problemsSolvedList3));

    public static final List<String> utilityPackage = new ArrayList<>(List.of(utilityPackageHeading));

    public static final List<String> utilityPackageList = new ArrayList<>(Arrays.asList(
            utilityPackageList1,utilityPackageList2,utilityPackageList3,utilityPackageList4,utilityPackageList5));

    public static final List<String> problemsSolvedListCtd = new ArrayList<>(Arrays.asList(
            problemsSolvedList4,problemsSolvedList5));
}
