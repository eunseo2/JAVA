package com.example.stream.mock;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class User {
  private final int id;
  private final String name;
  private final String email;

  public User(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public static List<User> userList(){
    List<User> userList = new ArrayList<>();
    userList.add(new User(1,"user1","user1@gmail.com"));
    userList.add(new User(2,"user2","user2@gmail.com"));
    userList.add(new User(3,"user3","user3@gmail.com"));
    return userList;
  }
}