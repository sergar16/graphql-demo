package org.serhii.example.repository;

import org.serhii.example.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
    @Override
    Optional<Player> findById(Long aLong);
}
