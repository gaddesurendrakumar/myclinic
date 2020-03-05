package my.clinic.myclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID>  {

    protected Map<ID,T> map = new HashMap<>();

    Set<T>  findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save( ID id,T object){
        map.put(id,object);
        return object;

    }

    void deleteById(Long id){
        map.remove(id);

    }

    void delete(T object){

        map.keySet().removeIf(entry-> entry.equals(object));

    }
}
