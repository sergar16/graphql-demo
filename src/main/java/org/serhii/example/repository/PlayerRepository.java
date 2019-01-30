package org.serhii.example.repository;

import org.serhii.example.model.Player;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PlayerRepository {
    public List<Player> findAll() {
        return Collections.singletonList(new Player());
    }

    public Player findOne(Long id) {
        return new Player();
    }
}
