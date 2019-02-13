package org.serhii.example.service;

import lombok.AllArgsConstructor;
import org.serhii.example.model.Club;
import org.serhii.example.model.Player;
import org.serhii.example.repository.ClubRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class PlayerService {
    private ClubRepository clubRepository;

    @Transactional
    public Player addPlayer(String surname, Long clubId) {
        Club targetClub = clubRepository.getOne(clubId);
        Player newPlayer = Player.builder()
                .surname(surname)
                .build();
        targetClub.getPlayers().add(newPlayer);
        clubRepository.save(targetClub);
        return newPlayer;
    }

}
