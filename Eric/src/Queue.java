
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    int getCapacity();
    void enqueue(E e);
    E dequeue();
    E getFront();
    String toString();
}
