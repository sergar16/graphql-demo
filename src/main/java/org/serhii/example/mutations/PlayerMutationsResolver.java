package org.serhii.example.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.serhii.example.model.Player;
import org.serhii.example.service.PlayerService;
import org.serhii.example.service.PlayerTransferService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerMutationsResolver implements GraphQLMutationResolver {
    private PlayerService playerService;
    private PlayerTransferService playerTransferService;

    public Player addPlayer(String surname, Long clubId) {
        return playerService.addPlayer(surname, clubId);
    }

    public Player transferPlayer(Long playerId, Long newClubId) {
        return playerTransferService.transferPlayer(playerId, newClubId);
    }
}
