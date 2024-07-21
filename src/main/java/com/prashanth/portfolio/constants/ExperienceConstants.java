package com.prashanth.portfolio.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.prashanth.portfolio.constants.Constants.*;

public class ExperienceConstants {
    public static final List<String> PJ2_SKILLS = new ArrayList<>(Arrays.asList(
            "Spring Boot", "Java","Azure Cloud", "JUnit", "Karate", "MongoDB"));
    public static final List<String> PJ1_SKILLS = new ArrayList<>(Arrays.asList(
            "JavaScript", "Vue.js","Html", "CSS", "Jest"));
    public static final List<String> PROJECT_2_EXPERIENCE = new ArrayList<>(Arrays.asList(
            PJ2_EXPERIENCE1,PJ2_EXPERIENCE2,PJ2_EXPERIENCE3,PJ2_EXPERIENCE4,PJ2_EXPERIENCE5));
    public static final List<String> PROJECT_1_EXPERIENCE = new ArrayList<>(Arrays.asList(
            PJ1_EXPERIENCE1,PJ1_EXPERIENCE2,PJ1_EXPERIENCE3));
}
