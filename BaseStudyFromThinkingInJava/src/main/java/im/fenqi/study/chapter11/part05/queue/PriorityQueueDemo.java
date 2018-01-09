package im.fenqi.study.chapter11.part05.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

/*
* 11.11、优先队列
* */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //自然顺序
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i=0;i<10;i++)
            priorityQueue.offer(random.nextInt(i+10));
        QueueDemo.printQ(priorityQueue);
        //反自然顺序
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<10;i++)
            priorityQueue1.offer(random.nextInt(i+10));
        QueueDemo.printQ(priorityQueue1);
    }
}
