drop database if exists  db_289450475;

  create database db_289450475;
  use db_289450475;

  create table rooms(
    id int not null auto_increment,
    room_name varchar(25) not null,
    room_value int,
    primary key(id)
  )DEFAULT CHARSET=utf8;

  insert into rooms (room_name, room_value) values ('RN1', 1);
  insert into rooms (room_name, room_value) values ('RN2', 3);
  insert into rooms (room_name, room_value) values ('RN3', 2);
