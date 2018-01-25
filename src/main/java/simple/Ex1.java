package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
  public static void breakTheList(List l) {
    l.add(LocalDate.now());
  }

  public static void main(String[] args) {
    // Java 6 version
//    List<String> ls = new ArrayList<String>(Arrays.asList(LocalDate.now()));
    List<String> ls = new ArrayList<>(Arrays.asList("Alan"/*LocalDate.now()*/));

    ls.add("Fred");
    ls.add("Jim");
    ls.add("Sheila");

//    ls.add(LocalDate.now()); // REJECTED when List is "typed"
//    String st = (String)ls.get(2);

    String st = ls.get(2); // generated binary still contains cast
    breakTheList(ls);

    for (Object o : ls) {
      System.out.println("> " + o);
    }

    ls.forEach((Object s) -> System.out.println(s));
//    ls.forEach(s -> System.out.println(s)); // casts to generic type, fails!
  }
}
