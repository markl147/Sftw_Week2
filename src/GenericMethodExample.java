import java.util.ArrayList;

public class GenericMethodExample {
    //generic method print array
    public static < E > void printArray( E[] inputArray)
    {
        //Display array elements
        for( E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <E> void printArray(ArrayList<E> input) {
        for ( E element : input) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Creates arrays of integer, double and character
        Integer[] intArray = { 1, 2, 3, 4, 5,};
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = { "Hello", "Ray"};

        ArrayList<Double> listD = new ArrayList<Double>();
        listD.add(2.1);
        listD.add(4.6);
        listD.add(33.11);

        ArrayList<String> listS = new ArrayList<String>();
        listS.add("hi");
        listS.add("there");
        listS.add("again");

        ArrayList<Integer> listI = new ArrayList<Integer>();
        listI.add(2);
        listI.add(4);
        listI.add(33);

        System.out.println("Array integerArray contains: ");
        printArray(intArray);

        System.out.println("Array doubleArray contains: ");
        printArray(doubleArray);

        System.out.println("Array charArray contains: ");
        printArray(charArray);

        System.out.println("Array stringArray contains: ");
        printArray(stringArray);

        System.out.println("List contains: ");
        printArray(listI);

        System.out.println("List contains: ");
        printArray(listS);

        System.out.println("List contains: ");
        printArray(listD);
    }
}
