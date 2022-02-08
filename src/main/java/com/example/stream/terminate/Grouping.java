package com.example.stream.terminate;

import com.example.stream.mock.User;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
  public static void main(String[] args) {
    List<User> list = User.userList();

    Map<Integer, List<User>> collectorMapOfLists =
      list.stream()
        .collect(Collectors.groupingBy(User::getGroupId));

    for(int key : collectorMapOfLists.keySet()){
      System.out.println(collectorMapOfLists.get(key));
    }

  }
}
