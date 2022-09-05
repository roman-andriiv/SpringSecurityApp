package com.example.andriiv.services;

import com.example.andriiv.models.Person;
import com.example.andriiv.repositories.PeopleRepository;
import com.example.andriiv.security.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Roman_Andriiv
 */
@Service
public class PersonDetailsService implements UserDetailsService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PersonDetailsService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Person> person = peopleRepository.findByUsername(username);

        if (person.isEmpty()) {
            throw new UsernameNotFoundException("No person found with username " + username);
        }

        return new PersonDetails(person.get());
    }
}
