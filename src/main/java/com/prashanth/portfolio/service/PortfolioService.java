package com.prashanth.portfolio.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import static com.prashanth.portfolio.constants.Constants.*;

@Service
public class PortfolioService {
    public void getSkills(Model model){
        model.addAttribute("backendSkills", backendSkills);
        model.addAttribute("frontendSkills", frontendSkills);
    }
    public void getSolved(Model model){
        model.addAttribute("utilityPackageList", utilityPackageList);
        model.addAttribute("problemsSolvedListCtd", problemsSolvedListCtd);
        model.addAttribute("utilityPackage", utilityPackage);
        model.addAttribute("problemsSolved", problemsSolved);
        model.addAttribute("problemsSolvedList", problemsSolvedList);
    }
}
