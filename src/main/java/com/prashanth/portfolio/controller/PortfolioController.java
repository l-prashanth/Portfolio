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
    @GetMapping("/l-prashanth")
    public String getPages(Model model) {
        portfolioService.handlePages(model);
        portfolioService.getALlPageContent(model);
        return "portfolio";
    }
}
