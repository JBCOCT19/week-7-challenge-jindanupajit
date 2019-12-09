package com.jindanupajit.bullhorn.bluehorn.repository;

import com.jindanupajit.bullhorn.bluehorn.model.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeopleRepository extends CrudRepository<People, Long> {
    Optional<People> findByUsername(String username);
}
