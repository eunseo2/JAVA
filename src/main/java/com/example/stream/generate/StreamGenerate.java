package com.example.stream.generate;

import com.example.stream.mock.User;
import java.util.List;
import java.util.stream.Stream;

public class StreamGenerate {
  public static void main(String[] args) {
    List<User> userList = User.userList();

    Stream<User> generatedStream =
      Stream.generate(()-> userList.get(0)).limit(5);

    generatedStream.forEach(System.out::println);

  }
}
