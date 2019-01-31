package org.serhii.example.repository;

import org.serhii.example.model.*;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ClubRepository {

    public Club findOne(String string) {
        return  Club.builder()
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
                .build();
    }

    public List<Club> findAll() {
        return Collections.emptyList();
    }
}
