package com.example.petclinic.petclinic.repository.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save (ID id, T object) {
        map.put(id, object);
        return object;
    }

    void delete(ID id){
        map.remove(id);
    }

    T findById(ID id) {
        return map.get(id);
    }
}
