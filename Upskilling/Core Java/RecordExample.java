import java.util.*;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person>people = Arrays.asList(
            new Person("hari", 42),
            new Person("Arun", 15),
            new Person("Dharanishree", 18)
        );
        people.stream()
              .filter(p -> p.age()>20)
              .forEach(System.out::println);
    }
}