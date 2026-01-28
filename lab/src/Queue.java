import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<E> {
    private LinkedList<E> line;

    public Queue() {}
    /**
     * Adds an element to the end of the queue [Runtime: O(1)]
     * @param element The element value to add
     */
    public void add(E element) {
        line.addLast(element);
    }

    /**
     * Removes and returns the first element of the queue [Runtime: O(1)]
     * @return the removed element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E remove() throws NoSuchElementException {
        if(size()==0) throw new NoSuchElementException();
        return line.remove();
    }

    /**
     * Returns the first element of the queue [Runtime: O(1)]
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() throws NoSuchElementException {
        if(size()==0) throw new NoSuchElementException();
        return line.peek();
    }

    /**
     * Returns the size of the queue [Runtime: O(1)]
     * @return the size of the queue
     */
    public int size() {return line.size();}

    /**
     * Return true if the queue is empty, false otherwise [Runtime: O(1)]
     * @return is the list is empty
     */
    public boolean isEmpty() {return (line.size()==0);}
}