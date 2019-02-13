package org.serhii.example.service;

import lombok.AllArgsConstructor;
import org.serhii.example.model.Club;
import org.serhii.example.model.Player;
import org.serhii.example.repository.ClubRepository;
import org.serhii.example.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class PlayerTransferService {
    ClubRepository clubRepository;
    PlayerRepository playerRepository;
    EntityManager entityManager;

    @Transactional
    public Player transferPlayer(Long playerId, Long newClubId) {
        Club byName = clubRepository.findById(newClubId).get();
        Player playerForTransfer = playerRepository.findById(playerId).get();
        playerForTransfer.setClub(byName);
        playerRepository.save(playerForTransfer);
        return playerForTransfer;
    }
}
