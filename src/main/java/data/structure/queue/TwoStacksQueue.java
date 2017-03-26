package data.structure.queue;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Stack;

/**
 * Describe  a  queue  data  structure  that  is  implemented  using  one  or  more  stacks.
 * Don't worry  about  running  time.   Write  the  enqueue  and  dequeue  operations  for  the  queue.
 */
public class TwoStacksQueue<E> extends AbstractQueue<E> {

    private Stack<E> firstStack = new Stack<>();
    private Stack<E> secondStack = new Stack<>();

    public Iterator<E> iterator() {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean offer(E e) {
        while (!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }

        return firstStack.push(e) != null;
    }

    public E poll() {
        while (!secondStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }

        return firstStack.pop();
    }

    public E peek() {
        while (!secondStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }
        return firstStack.peek();
    }
}
