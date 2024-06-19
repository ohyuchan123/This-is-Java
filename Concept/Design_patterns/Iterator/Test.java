package Concept.Design_patterns.Iterator;

public class Test {
    public static void main(String[] args) {
        GenericContainer<String> container = new GenericContainer<>();
        String[] strArray = {"Hello", "Iterator", "Pattern"};
        container.setArray(strArray);

        Iterator<String> iter = container.getIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        GenericContainer<Integer> container2 = new GenericContainer<>();
        Integer[] intArray = {1, 5, 2, 4};
        container2.setArray(intArray );
        
        Iterator<Integer> iter2 = container2.getIterator();
        while( iter2.hasNext() ) {
            System.out.println(iter2.next());
        }
    }
}
