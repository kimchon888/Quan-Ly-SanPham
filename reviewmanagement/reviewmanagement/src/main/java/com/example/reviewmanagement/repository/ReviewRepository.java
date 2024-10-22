package com.example.reviewmanagement.repository;


import com.example.reviewmanagement.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
