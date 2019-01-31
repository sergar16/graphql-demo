package org.serhii.example.repository;

import org.serhii.example.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ClubRepository {

    private static final List<Club> clubs = new ArrayList<>();

    {
     clubs.add(Club.builder()
        .id(1l)
        .name("Arsenal")
        .stadium(new Stadium())
        .players(Collections.singletonList(
                Player.builder()
                        .id(1)
                        .surname("Arshavin")
                        .shirtNumber(23)
                        .position(Position.MIDLEFILDER)
                        .build()
        ))
        .coach(new Coach())
        .build());
    }

    public Club findOne(String string) {
        return clubs.stream()
                .filter(club -> club.getName().equals(string))
                .findAny()
                .get();
    }

    public List<Club> findAll() {
        return clubs;
    }

    public void save(Club club){
        clubs.add(club);
    }
}
