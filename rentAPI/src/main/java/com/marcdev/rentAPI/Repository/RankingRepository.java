package com.marcdev.rentAPI.Repository;

import com.marcdev.rentAPI.model.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingRepository extends JpaRepository<Ranking, Long> {
}
