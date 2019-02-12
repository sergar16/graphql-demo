package org.serhii.example.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.serhii.example.model.Club;
import org.serhii.example.model.Player;
import org.serhii.example.repository.ClubRepository;
import org.serhii.example.repository.PlayerRepository;
import org.serhii.example.service.PlayerTransferService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerMutationsResolver implements GraphQLMutationResolver {
    PlayerRepository playerRepository;
    ClubRepository clubRepository;
    PlayerTransferService playerTransferService;

    public Player addPlayer(String surname, Long clubId) {
        Club targetClub = clubRepository.getOne(clubId);
        Player newPlayer = Player.builder()
                .surname(surname)
                .build();
        clubRepository.save(targetClub);
        return newPlayer;
    }

    public Player transferPlayer(Long playerId, Long newClubId) {
        return playerTransferService.transferPlayer(playerId, newClubId);
    }
}
