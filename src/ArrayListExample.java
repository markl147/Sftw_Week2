import java.util.ArrayList;
public class ArrayListExample {

    private ArrayList<Person> theListOfPeople = new ArrayList();

    public ArrayListExample() {
        theListOfPeople.add(new Person("Michael", 87123457, "Dublin"));
        theListOfPeople.add(new Person("Mary", 875695567, "Cork"));
        theListOfPeople.add(new Person("Matthew", 87127641, "Westmeath"));
        theListOfPeople.add(new Person("John", 87287467, "Galway"));
    }

    public Person getRefForName(String pName) {
        //Because an ArrayList doesnt store tagged value
        //pairs you have to search the list for the customer
        for(Person p : theListOfPeople){
            if(p.getName().equals(pName)){
                return p;
            }
        }
        return null;
    }

}
