package com.jindanupajit.bullhorn.jedi.util.thymeleaf;

import org.springframework.data.repository.CrudRepository;

public @interface MapRepository {
    Class<? extends CrudRepository> value();
}
