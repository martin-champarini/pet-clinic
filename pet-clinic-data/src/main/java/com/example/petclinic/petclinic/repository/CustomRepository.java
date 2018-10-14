package com.example.petclinic.petclinic.repository;

import java.util.Set;

public interface CustomRepository<T, ID> {
    T save(T object);
    void delete(ID id);
    T findById(ID id);
    Set<T> finAll();
}
