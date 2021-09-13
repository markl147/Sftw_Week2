import java.util.HashMap;

public class HashMapExample {
    private HashMap<String, Person> theListOfPeople = new HashMap<>();

    public HashMapExample() {
        theListOfPeople.put("Michael", new Person("Michael", 87123457, "Dublin"));
        theListOfPeople.put("Mary", new Person("Mary", 87123852, "Cork"));
        theListOfPeople.put("Claire", new Person("Claire", 87123321, "Westmeath"));
        theListOfPeople.put("John", new Person("John", 87123123, "Galway"));
    }

    public Person getRefForName(String name) {
        //You can use the key to access the object directly without searching
        return theListOfPeople.get(name);
    }
}
