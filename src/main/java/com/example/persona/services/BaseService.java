package com.example.persona.services;

import com.example.persona.entities.Base;
import org.apache.catalina.LifecycleState;

import java.io.Serializable;
import java.util.List;
/*
public interface BaseService<E>{
    public List<E> findAll() throws Exception;
    public E findById( Long id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
*/
public interface BaseService<E extends Base, ID extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}