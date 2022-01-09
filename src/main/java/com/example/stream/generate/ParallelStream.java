package com.example.stream.generate;

import com.example.stream.mock.User;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
  public static void main(String[] args) {
    List<User> list = User.userList();

    //list -> parallelStream
    Stream<User> parallelStream = list.parallelStream();

    //병렬 여부 확인
    System.out.println(parallelStream.isParallel());

    boolean isId = parallelStream
      .map(user -> {
        System.out.println(user);
        return user.getId() * 10;
        }
      )
      .anyMatch(id -> id > 10);

    System.out.println(isId);
  }
}
