package com.example.stream.process;

import com.example.stream.mock.User;
import java.util.List;

public class Iterating {
  public static void main(String[] args) {
    List<User> list = User.userList();

    int sum  = list.stream().mapToInt(User::getId).peek(System.out::println).sum();
    System.out.println("total = " + sum);
  }
}
