package org.serhii.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.serhii.example.model.Player;
import org.serhii.example.repository.PlayerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
    private PlayerRepository playerRepository;

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }
    public Player getPlayer(Long id) {
        return playerRepository.findOne(id);
    }

}