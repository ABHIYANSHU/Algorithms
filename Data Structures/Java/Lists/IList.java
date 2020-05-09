package Java.Lists;

public interface IList<E> extends Iterable<E> {
    
    int Length();
    void Add(E item);
    void Remove(E item);
    void RemoveAll();
    E[] ToArray();
    boolean Exists(E item);
    int IndexOf(E item);
    E ItemAt(int index);

}