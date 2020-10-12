package com.skates.skates;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TypeRepository extends CrudRepository<Category, Long> {
    Category findSkatesByCategory(String category);
//   Collection<Category> findSkatesById(Long id);
}
