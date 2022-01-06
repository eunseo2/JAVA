package com.example.stream.generate;

import com.example.stream.mock.User;
import java.util.List;
import java.util.stream.Stream;

public class StreamIterate {
  public static void main(String[] args) {
    List<User> userList = User.userList();

    Stream<User> iteratedStream =
      Stream.iterate(userList.get(0),
        user -> {
          user.update(user.getId()+2);
          return user;
        }
      ).limit(4);

    iteratedStream.forEach(System.out::println);
  }

}
