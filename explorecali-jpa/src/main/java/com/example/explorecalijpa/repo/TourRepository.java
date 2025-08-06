package com.example.explorecalijpa.repo;

import com.example.explorecalijpa.model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.explorecalijpa.model.Difficulty;
import com.example.explorecalijpa.model.Tour;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;
import java.util.Optional;

public interface TourRepository extends JpaRepository<Tour, Integer> {
    // Additional query methods can be defined here if needed
    // For example, to find tours by difficulty or region, you could add:
    List<Tour> findByDifficulty(Difficulty difficulty);
    List<Tour> findByTourPackageCode(String packageCode);
}

