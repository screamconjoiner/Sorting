package misc;

/**
 *
 * @author Connor
 */
public class Job implements Comparable<Job> {
    
    public int jobNumber;
    public int deadline;
    public int profit;
    
    public Job(int job, int deadline, int profit) {
     this.jobNumber = job;
     this.deadline = deadline;
     this.profit = profit;
    }


    @Override
    public int compareTo(Job other) {
        return Integer.compare(this.deadline, other.deadline);
    }
    
    @Override
    public String toString() {
        return "[" + jobNumber + ", " + deadline + ", " + profit + "]";
    }
    
}
