package com.devlabs.sfgpetclinic.service.map;

import com.devlabs.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    protected Set findAll() {
        return new HashSet<>(map.values());
    }

    protected T findById(ID id) {
        return map.get(id);
    }

    protected T save(T object) {
        if( object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
         return object;
    }

    protected void delete(T object) {
        map.entrySet().removeIf( entry -> entry.getValue().equals(object));
    }

    protected void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId(){
        Long nextId;
        try{
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
