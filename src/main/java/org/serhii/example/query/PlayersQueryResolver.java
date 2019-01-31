package org.serhii.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.serhii.example.model.Player;
import org.serhii.example.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayersQueryResolver implements GraphQLQueryResolver {
    private PlayerRepository playerRepository;

    public List<Player> players() {
        return playerRepository.findAll();
    }

    public Player player(Long id) {
        return playerRepository.findOne(id);
    }

}