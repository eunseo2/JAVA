package com.example.stream.generate;

import com.example.stream.mock.User;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilder {
  public static void main(String[] args) {
    List<User> list = User.userList();

    Stream<User> builderStream = Stream.<User>builder()
      .add(list.get(0))
      .add(list.get(1))
      .add(list.get(2))
      .build();

    builderStream.forEach(System.out::println);
  }
}
