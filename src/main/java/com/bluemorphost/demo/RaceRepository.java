package com.bluemorphost.demo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "racename", path = "racename")
public interface RaceRepository extends PagingAndSortingRepository<Race, Long> {

    List<Race> findByRaceName(@Param("racename") String raceName);


}

