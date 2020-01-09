package com.bluemorphost.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "participantincompetition", path = "participantincompetition")
public interface ParticipantInCompetitionRepository extends CrudRepository<ParticipantInCompetition, Long> {

}
