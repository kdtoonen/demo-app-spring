package com.bluemorphost.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "competitionname", path = "competitionname")
public interface CompetitionRepository extends CrudRepository<Competition, Long> {




}

