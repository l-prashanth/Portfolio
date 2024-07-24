package com.prashanth.portfolio.service;

import com.prashanth.portfolio.model.Page;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.prashanth.portfolio.constants.AwardConstants.*;
import static com.prashanth.portfolio.constants.CertificationConstants.*;
import static com.prashanth.portfolio.constants.ExperienceConstants.*;
import static com.prashanth.portfolio.constants.ProblemSolvedConstants.*;
import static com.prashanth.portfolio.constants.SkillConstants.*;

@Service
public class PortfolioService {
    public void handlePages(Model model) {
        List<Page> pages = new ArrayList<>(Arrays.asList(
                new Page("Overview"),
                new Page("Skills"),
                new Page("Experience"),
                new Page("Projects"),
                new Page("Achievements"),
                new Page("Why Hire Me?")
        ));
        model.addAttribute("pages", pages);
    }

    public void getALlPageContent(Model model) {
        getSkillsPage(model);
        getSolvedPage(model);
        getAwards(model);
        getCertifications(model);
        getExperience(model);
    }

    private void getSkillsPage(Model model) {
        model.addAttribute("backendSkills", BACKEND_SKILLS);
        model.addAttribute("frontendSkills", FRONTEND_SKILLS);
    }

    private void getSolvedPage(Model model) {
        model.addAttribute("handsOnHeading", HANDS_ON_HEADING);
        model.addAttribute("devopsHeading", DEVOPS_HEADING);
        model.addAttribute("problemHeading", PROBLEM_HEADING);
        model.addAttribute("utilityHeading", UTILITY_HEADING);
        model.addAttribute("otherHeading", OPTIMIZATIONS_HEADING);
        model.addAttribute("handsOnContent", HANDS_ON_CONTENT);
        model.addAttribute("devopsContent", DEVOPS_CONTENT);
        model.addAttribute("solveContent", SOLVE_CONTENT);
        model.addAttribute("solveContent1", SOLVE_CONTENT1);
        model.addAttribute("solveContent2", SOLVE_CONTENT2);
        model.addAttribute("utilityContent", UTILITY_CONTENT);
        model.addAttribute("utilityContentX", UTILITY_CONTENT_X);
        model.addAttribute("extraContent2", EXTRA_CONTENT2);
        model.addAttribute("extraContent3", EXTRA_CONTENT3);
//        model.addAttribute("problemsSolved", PROBLEM_SOLVED);
//        model.addAttribute("problemsSolvedList", PROBLEM_SOLVED_LIST);
//        model.addAttribute("utilityPackage", UTILITY_PACKAGE);
//        model.addAttribute("utilityPackageList", UTILITY_PACKAGE_LIST);
//        model.addAttribute("problemsSolvedListCtd", PROBLEM_SOLVED_LIST_CTD);
    }
    private void getAwards(Model model) {
        model.addAttribute("outstanding", OUTSTANDING);
        model.addAttribute("onTheSpot", ON_THE_SPOT);
    }
    private void getCertifications(Model model) {
        model.addAttribute("az204", AZ204);
        model.addAttribute("az900", AZ900);
        model.addAttribute("restApi", REST_API);
    }
    private void getExperience(Model model){
        model.addAttribute("pj2Experience", PROJECT_2_EXPERIENCE);
        model.addAttribute("pj1Experience", PROJECT_1_EXPERIENCE);
        model.addAttribute("pj2Skills", PJ2_SKILLS);
        model.addAttribute("pj1Skills", PJ1_SKILLS);

    }
}
