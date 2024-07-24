package com.prashanth.portfolio.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.prashanth.portfolio.constants.Constants.*;

public class ProblemSolvedConstants {
    public static final String HANDS_ON_HEADING = "HANDS-ON EXPERIENCE IN APPLICATION DEVELOPMENT AND DEPLOYMENT";
    public static final String DEVOPS_HEADING  = "DEVOPS ACTIVITIES HANDLED";
    public static final String PROBLEM_HEADING  = "PROBLEM-SOLVING INITIATIVES";
    public static final String UTILITY_HEADING  = "UTILITY DEVELOPMENT";
    public static final String OPTIMIZATIONS_HEADING  = "OTHER OPTIMIZATIONS";
    public static final String HANDS_ON_CONTENT1 = "Developed and deployed applications from scratch, managing the entire lifecycle from development to production";
    public static final String HANDS_ON_CONTENT2 = "Actively communicated with onshore clients and collaborated closely with them to ensure efficient application delivery";
    public static final String HANDS_ON_CONTENT3 = "Hosted Sprint Reviews for stakeholders, facilitating continuous improvement and timely deliveries";
    public static final String DEVOPS_CONTENT1 = "Built CI/CD pipelines on Azure Cloud";
    public static final String DEVOPS_CONTENT2 = "Deployed Spring Boot applications in App Service Containers";
    public static final String DEVOPS_CONTENT3 = "Implemented Function Apps";
    public static final String DEVOPS_CONTENT4 = "Created and managed Azure resources, including Storage Accounts, Key Vaults, and Private Link Endpoints";
    public static final String UTILITY_CONTENT_X = "Developed a versatile utility package to reduce redundancy, improve code size, and enhance readability. Key features included:";
    public static final String UTILITY_CONTENT1 = "Dynamic null object handlers for Strings and Integers";
    public static final String UTILITY_CONTENT2 = "Optional to String converters";
    public static final String UTILITY_CONTENT3 = "Environment identifiers";
    public static final String UTILITY_CONTENT4 = "JSON&OBJECT handler/converter";
    public static final String EXTRA_CONTENT1 = "Simplified Postman usage by globalizing the host URL based on the environment and automating the entire collection data flow from requests to responses";
    public static final String EXTRA_CONTENT2 = "Implemented multithreading for parallel API calls and JWT authentication for secure access";
    public static final String EXTRA_CONTENT3 = "Developed custom exception handling mechanisms for improved error management";
    public static final String SOLVE_CONTENT1 = "Challenge:\tApplication requests from consumers required logging and handling by a large production support team " +
            "Solution:\t\tProposed and implemented Resilience4j to manage application failures and minimize downtime,<br>\t\t        resulting in significant cost reductions by decreasing the need for extensive production support";
    public static final String SOLVE_CONTENT2 = "Challenge:\tAutomation test scripts required manual input from web forms<br>" +
            "Solution:\t\tUtilized HtmlUnit to programmatically fill out web forms, enabling automation scripts to operate seamlessly<br>\t\t        with the captured data.";
    public static final String SOLVE_CONTENT_MOBILE_1 = "Challenge:\tApplication requests from consumers required logging and<br>" +
            "handling by a large production support team<br>" +
            "Solution:\t\tProposed and implemented Resilience4j to manage application failures and minimize downtime,<br>\t\t        resulting in significant cost reductions by decreasing the need for extensive production support";
    public static final String SOLVE_CONTENT_MOBILE_2 = "Challenge:\\tAutomation test scripts required manual input from web forms<" +
            "Solution:\\t\\tUtilized HtmlUnit to programmatically fill out web forms,<br>" +
            "\t\t enabling automation scripts to operate seamlessly with the captured data.";

    public static final List<String> HANDS_ON_CONTENT = new ArrayList<>(Arrays.asList(
            HANDS_ON_CONTENT1,HANDS_ON_CONTENT3));
    public static final List<String> DEVOPS_CONTENT = new ArrayList<>(Arrays.asList(
            DEVOPS_CONTENT1,DEVOPS_CONTENT2,DEVOPS_CONTENT3,DEVOPS_CONTENT4));
    public static final List<String> SOLVE_CONTENT = new ArrayList<>(Arrays.asList(
            SOLVE_CONTENT1,SOLVE_CONTENT2));
    public static final List<String> UTILITY_CONTENT = new ArrayList<>(Arrays.asList(
            UTILITY_CONTENT1,UTILITY_CONTENT2,UTILITY_CONTENT3,UTILITY_CONTENT4));
//    public static final List<String> EXTRA_CONTENT = new ArrayList<>(Arrays.asList(
//            EXTRA_CONTENT1,EXTRA_CONTENT2,EXTRA_CONTENT3));

}
