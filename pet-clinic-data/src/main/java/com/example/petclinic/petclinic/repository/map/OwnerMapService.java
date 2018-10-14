package com.example.petclinic.petclinic.repository.map;

import com.example.petclinic.petclinic.model.Owner;
import com.example.petclinic.petclinic.repository.CustomRepository;

import java.util.Set;

public abstract class OwnerMapService extends AbstractMapService<Owner, Long> implements CustomRepository<Owner, Long> {
    @Override
    public Owner save(Owner object) {
        return this.save(object);
    }

    @Override
    public void delete(Long id) {
        this.delete(id);
    }

    @Override
    public Set<Owner> finAll() {
        return this.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }
}
