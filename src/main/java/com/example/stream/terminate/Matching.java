package com.example.stream.terminate;

import com.example.stream.mock.User;
import java.util.List;

public class Matching {
  public static void main(String[] args) {
    List<User> list = User.userList();

    boolean anyMatch = list.stream()
      .anyMatch(user -> user.getName().contains("user1"));
    boolean allMatch = list.stream()
      .allMatch(user -> user.getName().startsWith("u"));
    boolean noneMatch = list.stream()
      .noneMatch(user -> user.getName().length() >10);

    System.out.println(anyMatch+" "+ allMatch+" "+noneMatch);

  }

}
