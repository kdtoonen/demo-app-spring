package com.bluemorphost.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "participant", path = "participant")
public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
