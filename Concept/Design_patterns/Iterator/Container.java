package Concept.Design_patterns.Iterator;

// 자료구조는 iterator를 제공해라
public interface Container<T> {
    Iterator<T> getIterator();
}
