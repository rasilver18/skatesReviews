package com.skates.skates;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TypeRepository extends CrudRepository<Category, Long> {
    Category findSkatesBySkateType(String skateType);

}
