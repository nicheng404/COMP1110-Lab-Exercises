package comp1110.lab8;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * This class represents a stack, in which elements are added and removed in a
 * last in, first out (LIFO) order. Duplicate elements are permitted.
 * When a stack is first created, it contains no elements.
 * The stack can grow to fit new elements as required.
 * Attempting to pop() or peek() an empty stack throws an EmptyStackException,
 * and does not result in any modification to the stack.
 * The Stack is implemented using an array data structure (a regular Java array),
 * and does not use any of the Java Collection classes other than
 * java.util.EmptyStackException.
 */
public class ArrayStack<T> {


    public int numElement = 0;
    public static final int DEFAULT_SIZE = 100000;
    public static final double GROWTH_FACTOR = 1.5;
    public int size;
    public T[] stackArray = (T[]) new Object[DEFAULT_SIZE];

    //    private Object EmptyStackException;

//    public ArrayStack() {
//        stackArray = (T[]) new Object[100000];
//    }

//    public int getSize(){
//        return stackArray.length;
//    }
//
//    public void printEach(){
//        for (T t: stackArray){
//            System.out.println(t);
//        }
//    }


    public ArrayStack() {
    }

    /**
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        // FIXME complete this method
        return numElement ==0 ;
    }

    /**
     * Add the given value to this stack,
     * placing it at the top of the stack.
     *
     * @param value the value to add to this stack
     */
    public void push(T value) {
        // FIXME complete this method
        if(numElement == size){
            //increase size by factor(multiply)
            size = (int) (size*GROWTH_FACTOR);
            //create new array
            T[] newArray = (T[]) new Object[size];
            //copy old into new (iterate and write)
            for (int i =0;i<numElement;i++){
                newArray[i] = stackArray[i];
            }
            stackArray = newArray;
            stackArray[numElement+1] = value;
            numElement++;
        }else {
            stackArray[numElement] = value;
            numElement++;
        }
        stackArray[numElement] = value;
        numElement++;

    }

    /**
     * Remove the value that is at the top of this stack, and return it.
     *
     * @return the value that was popped from the stack
     * @throws EmptyStackException if the stack is currently empty
     */
    public T pop() throws EmptyStackException {
        // FIXME complete this method
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        try {
            this.isEmpty();
        } catch (EmptyStackException e){

        }
        T out = stackArray[numElement-1];
        stackArray[numElement-1] = null;
//        System.out.println("set to null");
        numElement --;
//        System.out.println("--");
        System.out.println("pop one");
        return out;
    }

    /**
     * Get the value that is currently at the top of this stack,
     * but do not remove it from the stack.
     *
     * @return the value at the top of the stack
     * @throws EmptyStackException if the stack is currently empty
     */
    public T peek() {
        // FIXME complete this method
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        T value = stackArray[numElement-1];
        return value;
    }

    /**
     * Check whether a given value is contained in this stack.
     * Specifically, returns true if value is not null and
     * an element e is contained in the stack such that e.equals(value).
     *
     * @param value the value to search for
     * @return true if the value is contained in this stack
     */
    public boolean contains(T value) {
        // FIXME complete this method
        if (value != null){
            return Arrays.asList(stackArray).contains(value);

        }else {
            return false;
        }

    }

    /**
     * Create a String representation of this stack.
     * Elements on the stack are listed in order from top to bottom,
     * separated by commas (without spaces).
     * If the stack is empty, an empty string is returned.
     * For example, a stack containing the elements (from top to bottom)
     * "a", "b", and "c" would be represented as "a,b,c".
     *
     * @return a String representation of this stack
     */
    public String toString() {
        // FIXME complete this methods
        String out = "";
        if (this.isEmpty()){
            return "";
        }else {
            for (int i = stackArray.length-1;i>0;i--){
                if (this.stackArray[i]==null){
                } else {
                    out += stackArray[i].toString();
                    out += ","; } }
            out += stackArray[0].toString();
            return out; } }


    public static void main(String[] args) {
//        ArrayStack arrayStack = new ArrayStack();
  //      System.out.println(arrayStack.getSize());
    //    arrayStack.printEach();
    }
}