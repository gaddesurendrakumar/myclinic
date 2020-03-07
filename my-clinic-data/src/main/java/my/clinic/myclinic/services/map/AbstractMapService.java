package my.clinic.myclinic.services.map;

import my.clinic.myclinic.domain.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long>  {

    protected Map< Long, T> map = new HashMap<>();

    Set<T>  findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save( T object){
        if(object != null && object.getId() == null){
            object.setId(getNextId());
            map.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object can not be null to store...");
        }

        return object;

    }

    void deleteById(Long id){
        map.remove(id);

    }

    void delete(T object){

        map.keySet().removeIf(entry-> entry.equals(object));

    }

    private Long getNextId(){
        Long nexValue = 1L;
        try {
            nexValue = Collections.max( map.keySet())+1;
        }catch (NoSuchElementException ex){
            System.out.println("Map is null initially, so setting map index to 1");
        }
        return nexValue;
    }
}
