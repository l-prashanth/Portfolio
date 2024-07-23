package com.prashanth.portfolio.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.prashanth.portfolio.constants.Constants.*;

public class ProblemSolvedConstants {
    public static final String HANDS_ON_HEADING = "Hands-on Experience in Application Development and Deployment";
    public static final String HANDS_ON_CONTENT1 = "\t.Developed and deployed applications from scratch, managing the entire lifecycle from development to production";
    public static final String HANDS_ON_CONTENT2 = "\t.Actively communicated with onshore clients and collaborated closely with them to ensure efficient application delivery";
    public static final String HANDS_ON_CONTENT3 = "\t.Hosted Sprint Reviews for stakeholders, facilitating continuous improvement and timely deliveries";
    public static final List<String> HANDS_ON_CONTENT = new ArrayList<>(Arrays.asList(
            HANDS_ON_CONTENT1,HANDS_ON_CONTENT2,HANDS_ON_CONTENT3));
    public static final List<String> PROBLEM_SOLVED = new ArrayList<>(List.of(HEADING));

    public static final List<String> PROBLEM_SOLVED_LIST = new ArrayList<>(Arrays.asList(
            PROBLEMS_SOLVED_LIST_1,PROBLEMS_SOLVED_LIST_2,PROBLEMS_SOLVED_LIST_3));

    public static final List<String> UTILITY_PACKAGE = new ArrayList<>(List.of(UTILITY_PACKAGE_HEADING));

    public static final List<String> UTILITY_PACKAGE_LIST = new ArrayList<>(Arrays.asList(
            UTILITY_PACKAGE_LIST_1,UTILITY_PACKAGE_LIST_2,UTILITY_PACKAGE_LIST_3,UTILITY_PACKAGE_LIST_4,UTILITY_PACKAGE_LIST_5));

    public static final List<String> PROBLEM_SOLVED_LIST_CTD = new ArrayList<>(Arrays.asList(
            PROBLEMS_SOLVED_LIST_4,PROBLEMS_SOLVED_LIST_5));

}
