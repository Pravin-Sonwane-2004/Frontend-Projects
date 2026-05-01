package LinkedList;

import java.util.LinkedList;

public class LinkWithStrings {
    static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Java");
    list.add("Spring");
    list.add("Microservices");
    list.addFirst("Pravin");
    list.addLast("ok");

    for (String item : list) {
      System.out.println(item);
    }
  }
}
