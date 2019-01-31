package org.serhii.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Club {
    private Long id;
    private String name;
    private Stadium stadium;
    private List<Player> players;
    private Coach coach;

}
