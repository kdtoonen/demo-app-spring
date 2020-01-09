package com.bluemorphost.demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "team", path = "team")
public interface TeamRepository extends CrudRepository<Competition, Long> {

}
