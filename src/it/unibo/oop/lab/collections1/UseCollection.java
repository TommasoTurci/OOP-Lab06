package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

	private static final int TO_MS = 1_000_000;
	private static final int ELEMS = 100_000;
	private static final int ELEMS2 = 1000;

	private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	ArrayList<Integer> alist = new ArrayList<Integer>(1000);
    	for(int i=1000;i<2000; i++) {
    		alist.add(i);
    	}
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	LinkedList<Integer> llist = new LinkedList<Integer>();
    	llist.addAll(alist);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	int i=alist.get(alist.size()-1);
    	alist.set(alist.size()-1, alist.get(0));
    	alist.set(0, i);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for(int printed : alist) {System.out.println(alist.indexOf(printed)+": "+printed);}
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	alist.clear();
        long time = System.nanoTime();
        for(i=1;i<=ELEMS; i++) {
    		alist.add(i);
    	}
        time = System.nanoTime() - time;
        System.out.println("Inserting "+ELEMS+" new elements into an ArrayList took " + time
                + "ns (" + time / TO_MS + "ms)");
        llist.clear();
        time = System.nanoTime();
        for(i=1;i<=ELEMS; i++) {
    		llist.add(i);
    	}
        time = System.nanoTime() - time;
        System.out.println("Inserting "+ELEMS+" new elements into a LinkedList took " + time
                + "ns (" + time / TO_MS + "ms)");
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        time = System.nanoTime();
        for(i=0;i<ELEMS2; i++) {
    		alist.get(alist.size()/2);
    	}
        time = System.nanoTime() - time;
        System.out.println("Reading the middle element of an ArrayList "+ELEMS2+" times took " + time
                + "ns (" + time / TO_MS + "ms)");
        time = System.nanoTime();
        for(i=0;i<ELEMS2; i++) {
    		llist.get(llist.size()/2);
    	}
        time = System.nanoTime() - time;
        System.out.println("Reading the middle element of an LinkedList "+ELEMS2+" times took " + time
                + "ns (" + time / TO_MS + "ms)");
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        Map<String, Long> world= new HashMap<>();
        world.put("Africa", 1_110_635_000L);
        world.put("Americas", 972_005_000L);
        world.put("Antarctica", 0L);
        world.put("Asia", 4_298_723_000L);
        world.put("Europe", 742_452_000L);
        world.put("Oceania", 38_304_000L);
        /*
         * 8) Compute the population of the world
         */
        long pop=0;
        for (long ppl : world.values()) {
        	pop+=ppl;
        }
        System.out.println("Total population is of "+pop+" individuals.");
    }
}
