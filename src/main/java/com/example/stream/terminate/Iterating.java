package com.example.stream.terminate;

import com.example.stream.mock.User;
import java.util.List;

public class Iterating {
  public static void main(String[] args) {
    List<User> list = User.userList();
    list.stream().forEach(System.out::println);
  }
}
