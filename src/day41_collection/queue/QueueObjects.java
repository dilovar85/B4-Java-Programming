package day41_collection.queue;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2);
        //priorityQueue.add(null);

        System.out.println(priorityQueue);

        priorityQueue.offer(30);
        System.out.println(priorityQueue);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);



    }
}
