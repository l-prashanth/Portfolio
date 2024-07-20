package com.prashanth.portfolio.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import static com.prashanth.portfolio.utils.CommonUtils.generateUniqueId;

@Data
@RequiredArgsConstructor
public class Page {
    private String id = generateUniqueId();
    private final String pageName;
}