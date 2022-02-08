package com.example.stream.mock;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {
  private int id;
  private String name;
  private String email;
  private int groupId;

  public User(int id, String name, String email, int groupId) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.groupId = groupId;
  }

  public static List<User> userList(){
    List<User> userList = new ArrayList<>();
    userList.add(new User(1,"user1","user1@gmail.com",1));
    userList.add(new User(2,"user2","user2@gmail.com",1));
    userList.add(new User(3,"user3","user3@gmail.com",2));
    return userList;
  }

  public void update(int id){
    this.id = id;
  }
}
