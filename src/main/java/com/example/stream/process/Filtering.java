package com.example.stream.process;

import com.example.stream.mock.User;
import java.util.List;
import java.util.stream.Stream;

public class Filtering {
  public static void main(String[] args) {
    List<User> users = User.userList();
    Stream<User> stream = users.stream().filter(user -> user.getName().contains("1"));
    stream.forEach(System.out::print);
  }
}
