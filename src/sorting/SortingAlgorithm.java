package sorting;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Connor
 */
public class SortingAlgorithm {
    private static final Logger log = Logger.getLogger(SortingAlgorithm.class.getName());
    protected long startTime;
    protected long endTime;
    protected int numComparisons;
    
    public SortingAlgorithm() {
        SortingAlgorithm.log.setLevel(Level.FINE);
        this.numComparisons = 0;
    }
    
    public <E extends Comparable<? super E>> void sort(E[] a) {
        
    }
    
    protected <E extends Comparable<? super E>> void swap(E[] a, int i, int j) {
        if (i != j) {
            E t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }    

    protected <E extends Comparable<? super E>> void start() {
        getStartTime();
    }
    
    protected void getStartTime() {
        startTime = System.nanoTime();
    }
    
    protected String getDuration() {
       float time = endTime - startTime;
       time /= 1000000;
       return "Time: " + (time) + "ms" ;
    }
    
    protected void getEndTime() {
        endTime = System.nanoTime();
    }
    
    protected void reset() {
        numComparisons = 0;
        startTime = 0;
        endTime = 0;
    }
    
    protected void incrementComparisons() {
        numComparisons++;
    }    
    
    protected Logger getLogger() {
        return log;
    }
    
    protected <E> void print(E[] a) {
        String info = "";             
        if (a.length > 0) {
            info += ("{");
            info += (a[0]);
        for (int i = 1; i < a.length; i++) {
            info += (", " + a[i]);
        }
        info += ("}\n");
        info += ("# Comparisons: " + numComparisons + "\n");
        info += getDuration();
               
        getLogger().log(Level.INFO, info);
        }
    }
    
    protected <E extends Comparable<? super E>> void end(E[] a) {
        getEndTime();
        print(a);
        reset();
    }
}