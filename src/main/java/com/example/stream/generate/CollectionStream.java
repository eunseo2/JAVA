package com.example.stream.generate;

import com.example.stream.mock.User;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {
  public static void main(String[] args) {
    List<User> list = User.userList();

    // list -> stream
    Stream<User> stream = list.stream();
    stream.forEach(user->{
      System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());
    });
  }
}
