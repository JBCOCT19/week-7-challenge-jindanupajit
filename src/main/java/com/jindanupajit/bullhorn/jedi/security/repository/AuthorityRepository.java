package com.jindanupajit.bullhorn.jedi.security.repository;

import com.jindanupajit.bullhorn.jedi.security.model.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {
    Authority findByAuthority(String authority);
}
