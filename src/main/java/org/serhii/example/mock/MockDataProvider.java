package org.serhii.example.mock;

import org.serhii.example.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockDataProvider {
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
}
