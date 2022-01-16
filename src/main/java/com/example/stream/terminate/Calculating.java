package com.example.stream.terminate;

import static java.util.Collections.*;

import com.example.stream.mock.User;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Calculating {
  public static void main(String[] args) {
    List<User> list = User.userList();

    System.out.println("ListCount : " + list.stream().count());
    System.out.println("ListSum : " + list.stream().mapToInt(User::getId).sum());
    System.out.println("ListMinId : " + list.stream().mapToInt(User::getId).min());
    System.out.println("ListMaxId : " + list.stream().mapToInt(User::getId).max());

    //empty list
    List<Integer> emptyList = emptyList();
    long count = emptyList.stream().count();
    System.out.println("emptyListCount : " + count);
  }
}
