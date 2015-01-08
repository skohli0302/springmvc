package com.garry.controller;

import com.garry.model.Room;
import com.garry.dao.RoomDao;
import com.garry.dao.GenericDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoomController{
  @Autowired
  private GenericDao<Room> roomDao;

  @RequestMapping(value="/")
  public ModelAndView rooms(){
    List<Room> rooms = roomDao.list();
    ModelAndView model = new ModelAndView("rooms");
    model.addObject("roomList", rooms);    
    return model;
  }
}
