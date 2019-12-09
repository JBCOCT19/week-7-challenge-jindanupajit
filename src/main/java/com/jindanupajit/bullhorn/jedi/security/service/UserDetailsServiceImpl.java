package com.jindanupajit.bullhorn.jedi.security.service;


import com.jindanupajit.bullhorn.bluehorn.model.People;
import com.jindanupajit.bullhorn.bluehorn.repository.PeopleRepository;
import com.jindanupajit.bullhorn.jedi.security.model.Authority;
import com.jindanupajit.bullhorn.jedi.security.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PeopleRepository peopleRepository;

    Authority aAdmin = new Authority("ADMIN");
    Authority aUser = new Authority("USER");
    UserDetail uAdmin = new UserDetail("admin", JediPasswordEncoder.getInstance().encode(""),
            Collections.unmodifiableList(Arrays.asList(aAdmin, aUser)));

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        if (userName.equals("admin"))
            return uAdmin;

        Optional<People> people =  peopleRepository.findByUsername(userName);

        if (!people.isPresent())
            throw new UsernameNotFoundException("User '"+userName+"' not found.");

        return people.get();
    }


}
