package com.garry.dao;

import java.util.List;
import com.garry.model.*;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import org.springframework.stereotype.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;

@Repository("roomDao")
public class RoomDao extends GenericDao<Room>{

  public RoomDao(){
    super();
    persistentClass = Room.class;
  }
}
