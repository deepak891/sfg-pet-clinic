package com.devlabs.sfgpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    protected Set findAll() {
        return new HashSet<>(map.values());
    }

    protected T findById(ID id) {
        return map.get(id);
    }

    protected T save(ID Id, T object) {
         map.put(Id, object);
         return object;
    }

    protected void delete(T object) {
        map.entrySet().removeIf( entry -> entry.getValue().equals(object));
    }

    protected void deleteById(ID id) {
        map.remove(id);
    }
}
