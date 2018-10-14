package com.example.petclinic.petclinic.repository;

import java.util.Set;

public interface CustomRepository<T, ID> {
    T save(T object);
    void delete(T object);
    T findById(ID id);
}
