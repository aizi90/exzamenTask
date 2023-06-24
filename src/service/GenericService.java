package service;

import java.util.List;

public interface GenericService <T>{

    List<T>add(T t);
    List<T>getAll();

}




