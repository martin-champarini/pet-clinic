package com.example.petclinic.petclinic.repository;

import java.util.Set;

public interface CustomRepository<T, ID> {
    T save(T object);
    T delete(T object);
    Set<T> findById(ID id);
}
