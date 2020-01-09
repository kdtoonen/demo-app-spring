package com.bluemorphost.demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "memberinteam", path = "memberinteam")
public interface MemberInTeamRepository extends CrudRepository<Competition, Long> {

}
