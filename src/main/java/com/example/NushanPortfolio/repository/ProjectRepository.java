package com.example.NushanPortfolio.repository;
import com.example.NushanPortfolio.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProjectRepository extends MongoRepository<Project, String> {
}