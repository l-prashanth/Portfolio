package com.prashanth.portfolio.service;

import com.prashanth.portfolio.constants.ProblemSolvedConstants;
import com.prashanth.portfolio.model.Page;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.prashanth.portfolio.constants.AwardConstants.AWARD_1;
import static com.prashanth.portfolio.constants.Constants.*;

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
    }

    private void getSkillsPage(Model model) {
        model.addAttribute("backendSkills", backendSkills);
        model.addAttribute("frontendSkills", frontendSkills);
    }

    private void getSolvedPage(Model model) {
        model.addAttribute("utilityPackageList", utilityPackageList);
        model.addAttribute("problemsSolvedListCtd", problemsSolvedListCtd);
        model.addAttribute("utilityPackage", utilityPackage);
        model.addAttribute("problemsSolved", problemsSolved);
        model.addAttribute("problemsSolvedList", problemsSolvedList);
    }
    private void getAwards(Model model) {
        model.addAttribute("award1", AWARD_1);
//        model.addAttribute("problemsSolvedListCtd", problemsSolvedListCtd);
//        model.addAttribute("utilityPackage", utilityPackage);
//        model.addAttribute("problemsSolved", problemsSolved);
//        model.addAttribute("problemsSolvedList", problemsSolvedList);
    }
    private void getCertifications(Model model) {
        model.addAttribute("utilityPackageList", utilityPackageList);
        model.addAttribute("problemsSolvedListCtd", problemsSolvedListCtd);
        model.addAttribute("utilityPackage", utilityPackage);
        model.addAttribute("problemsSolved", problemsSolved);
        model.addAttribute("problemsSolvedList", problemsSolvedList);
    }
}
