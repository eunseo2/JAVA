package com.example.stream.generate;

import com.example.stream.mock.User;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {

  public static void main(String[] args) {
    List<User> list = User.userList();

    // list -> array
    User[] userArr = list.toArray(User[]::new);

    // array -> stream
    Stream<User> stream = Arrays.stream(userArr);
    stream.forEach(user->{
      System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());
    });

    //array -> streamOfArrayPart
    Stream<User> streamOfArrayPart = Arrays.stream(userArr,1,3);
    streamOfArrayPart.forEach(user->{
      System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());
    });

  }
}
