package org.serhii.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.serhii.example.model.Club;
import org.serhii.example.repository.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClubQueryResolver implements GraphQLQueryResolver {
    private ClubRepository clubRepository;

    public List<Club> clubs() {
        return clubRepository.findAll();
    }

    public Club club(String name) {
        return clubRepository.findOne(name);
    }

}