package com.jindanupajit.bullhorn.bluehorn.repository;

import com.jindanupajit.bullhorn.bluehorn.model.Message;
import com.jindanupajit.bullhorn.bluehorn.model.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    Iterable<Message> findAllByPeople(People people);
    void deleteAllByPeople(People people);
}
