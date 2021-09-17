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

    public static void main(String[] args) {
        //Creates arrays of integer, double and character
        Integer[] intArray = { 1, 2, 3, 4, 5,};
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = { "Hello", "Ray"};

        System.out.println("Array integerArray contains: ");
        printArray(intArray);

        System.out.println("Array doubleArray contains: ");
        printArray(doubleArray);

        System.out.println("Array charArray contains: ");
        printArray(charArray);

        System.out.println("Array stringArray contains: ");
        printArray(stringArray);
    }
}
