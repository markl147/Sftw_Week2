import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {
        //Create an Array List
        ArrayList al = new ArrayList();

        //add elements to the array list
        al.add("T");
        al.add("H");
        al.add("U");
        al.add("R");
        al.add("S");
        al.add("D");
        al.add("A");
        al.add("Y");

        System.out.println("Original contents of al: ");

        //create an iterator
        ListIterator litr = al.listIterator();

        //iterating through the list
        while(litr.hasNext()) {
            Object element = litr.next();
            System.out.println(element + " ");

            //modify the list elements
            litr.set(element + "+");

        }
    }
}
