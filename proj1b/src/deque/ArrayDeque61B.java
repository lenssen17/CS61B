package deque;

import java.util.ArrayList;
import java.util.List;

public class ArrayDeque61B<T> implements Deque61B<T> {
    private T[] item;
    public ArrayDeque61B() {
        item  = (T[]) new Object[8];
    }
    public int nextFirst = 0;
    public int nextLast = 1;
    public int arrsize;
    public int newFirst = 0 ;
    public int newLast = 1;
    public int size = 8;

    /**
     * Add {@code x} to the front of the deque. Assumes {@code x} is never null.
     *
     * @param x item to add
     */
    @Override
    public void addFirst(T x) {
        newFirst = Math.floorMod(nextFirst, size);
        item[newFirst] = x;
        nextFirst--;
        arrsize++;
    }

    /**
     * Add {@code x} to the back of the deque. Assumes {@code x} is never null.
     *
     * @param x item to add
     */
    @Override
    public void addLast(T x) {
        newLast = Math.floorMod(nextLast, size);
        item[newLast] = x;
        nextLast++;
        arrsize++;
    }

    /**
     * Returns a List copy of the deque. Does not alter the deque.
     *
     * @return a new list copy of the deque.
     */
    @Override
    public List<T> toList() {
        int counter = nextFirst;
        List<T> returnList = new ArrayList<>();
        while(counter < nextLast - 1){
            returnList.add(item[Math.floorMod(counter + 1, size)]);
            counter++;
        }
        return returnList;
    }

    /**
     * Returns if the deque is empty. Does not alter the deque.
     *
     * @return {@code true} if the deque has no elements, {@code false} otherwise.
     */
    @Override
    public boolean isEmpty() {
        if (arrsize > 0){
            return false;
        }
        return true;
    }

    /**
     * Returns the size of the deque. Does not alter the deque.
     *
     * @return the number of items in the deque.
     */
    @Override
    public int size() {
        return arrsize;
    }

    /**
     * Remove and return the element at the front of the deque, if it exists.
     *
     * @return removed element, otherwise {@code null}.
     */
    @Override
    public T removeFirst() {
        T firstdeleted = item[newFirst];
        item[newFirst] = null;
        nextFirst++;
        return firstdeleted;
    }

    /**
     * Remove and return the element at the back of the deque, if it exists.
     *
     * @return removed element, otherwise {@code null}.
     */
    @Override
    public T removeLast() {
        T lastdeleted = item[newLast];
        item[newLast] = null;
        nextLast--;
        return lastdeleted ;
    }

    /**
     * The Deque61B abstract data type does not typically have a get method,
     * but we've included this extra operation to provide you with some
     * extra programming practice. Gets the element, iteratively. Returns
     * null if index is out of bounds. Does not alter the deque.
     *
     * @param index index to get
     * @return element at {@code index} in the deque
     */
    @Override
    public T get(int index) {
        if(index > size || index < 0){
            return null;
        }
        return item[index];
    }

    /**
     * This method technically shouldn't be in the interface, but it's here
     * to make testing nice. Gets an element, recursively. Returns null if
     * index is out of bounds. Does not alter the deque.
     *
     * @param index index to get
     * @return element at {@code index} in the deque
     */
    @Override
    public T getRecursive(int index) {
        throw new UnsupportedOperationException("No need to implement getRecursive for proj 1b");
    }
}
