package com.example.NushanPortfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "experiences")
public class Experience {

    @Id
    private String id;

    private String title;

    private String company;

    private Date startDate;

    private Date endDate;

    // Constructors
    public Experience() {
    }

    // Getters and setters
    // Omitted for brevity
}
