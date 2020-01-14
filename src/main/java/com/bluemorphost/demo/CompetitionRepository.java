package com.bluemorphost.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "competition", path = "competition")
public interface CompetitionRepository extends CrudRepository<Competition, Long> {



}

