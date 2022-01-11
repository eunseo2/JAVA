package com.example.stream.process;

import com.example.stream.mock.User;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mapping {
  public static void main(String[] args) {
    //map
    List<User> list = User.userList();
    Stream<String> stream = list.stream()
      .map(User::getName);
    stream.forEach(System.out::println);

    //map vs flatMap
    String[][] namesArray = new String[][]{
      {"JAVA","PYTHON"},{"JAVASCRIPT"}};

    Arrays.stream(namesArray)
      .flatMap(Arrays::stream)
      .forEach(System.out::println);

    Arrays.stream(namesArray)
      .map(Arrays::stream)
      .forEach(name -> name.forEach(System.out::println));
  }
}
