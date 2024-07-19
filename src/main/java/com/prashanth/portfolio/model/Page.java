package com.prashanth.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

import static com.prashanth.portfolio.utils.CommonUtils.generateUniqueId;

@Data
@RequiredArgsConstructor
public class Page {

    private String id = generateUniqueId();
    private final String title;
    private final String content;
    private final String imageUrl;
//    private String generateUniqueId() {
//        return UUID.randomUUID().toString();
//    }
}