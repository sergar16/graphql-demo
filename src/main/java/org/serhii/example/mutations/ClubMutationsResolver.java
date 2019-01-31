package org.serhii.example.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.serhii.example.model.Club;
import org.serhii.example.repository.ClubRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClubMutationsResolver implements GraphQLMutationResolver {
    ClubRepository clubRepository;

    public Club addClub(String name){
        Club club = Club.builder()
                .name(name)
                .build();
        clubRepository.save(club);
        return club;
    }
}
