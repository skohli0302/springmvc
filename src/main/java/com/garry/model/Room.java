package com.garry.model;

public class Room {
  private int id;
  private String room_name;
  private String room_value;

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return this.id;
  }


  public void setRoom_name(String room_name){
    this.room_name = room_name;
  }

  public String getRoom_name(){
    return this.room_name;
  }

  public void setRoom_value(String room_value){
    this.room_value = room_value;
  }

  public String getRoom_value(){
    return this.room_value;
  }

}
