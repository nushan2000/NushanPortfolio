package com.example.NushanPortfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "skills")
public class Skill {

    @Id
    private String id;

    private String name;

    private String description;

    // Constructors
    public Skill() {
    }

    // Getters and setters
    // Omitted for brevity
}