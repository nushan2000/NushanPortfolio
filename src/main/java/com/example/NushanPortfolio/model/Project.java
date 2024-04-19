package com.example.NushanPortfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "projects")
public class Project {

    @Id
    private String id;

    private String title;

    private String description;

    private Date startDate;

    private Date endDate;

    private List<String> skills; // Assuming skills are represented as strings

    // Constructors
    public Project() {
    }

    // Getters and setters
    // Omitted for brevity
}