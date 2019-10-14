package com.bobsantosjr.springprometheus.springprometheus.person;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;
import java.util.Set;

import static java.util.stream.Collectors.toList;

@Repository
class PersonRepository {
    private final Set<String> names = Set.of("John", "Mary", "William", "Anna", "Charles", "Elizabeth", "George", "Margaret");
    private final Random random = new Random();

    List<Person> all() {
        return names.stream()
            .map(name -> new Person(name, random.nextInt(50)))
            .collect(toList());
    }
}
