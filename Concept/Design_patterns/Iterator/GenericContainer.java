package Concept.Design_patterns.Iterator;

public class GenericContainer<T> implements Container<T> {
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> getIterator() {
        return new GenericIterator();
    }

    private class GenericIterator implements Iterator<T> {
        int index;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public T next() {
            if (this.hasNext()) return array[index++];
            return null;
        }
    }
}
