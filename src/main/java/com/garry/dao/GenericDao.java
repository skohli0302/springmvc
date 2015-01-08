package com.garry.dao;

import java.util.List;
import com.garry.model.*;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.springframework.stereotype.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;
import org.springframework.orm.hibernate4.HibernateTemplate;

public abstract class GenericDao<T>{

  @Autowired
  private HibernateTemplate template = null;

  protected Class<T> persistentClass;

  public List<T> list(){
    List<T> list = template.loadAll(persistentClass);
    return list;
  }

}
