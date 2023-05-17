import java.util.PriorityQueue;

public class myPriorityQueue {
    public static void main(String[] args) {
        // Create a priority queue with Integer elements
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(7);
        priorityQueue.add(1);

        // Retrieve and remove the element with the highest priority
        int highestPriority = priorityQueue.poll();
        System.out.println("Highest priority element: " + highestPriority);

        // Iterate over the priority queue elements
        System.out.println("Priority queue elements:");
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println(element);
        }
    }
}
