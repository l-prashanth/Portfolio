package com.prashanth.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;
@Data
@AllArgsConstructor
public class Project {
    private String title;
    private String description;
    private List<String> features;
    private List<String> technologies;


    // Constructors, getters, and setters
}