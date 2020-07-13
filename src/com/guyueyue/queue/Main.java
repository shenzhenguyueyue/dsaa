package com.guyueyue.queue;

public class Main {
    public static void main(String[] args) {
//        Queue myQueue = new Queue(3);
//        System.out.println(myQueue.isFull());
//        myQueue.push(2);
//        myQueue.push(1);
//        myQueue.push(4);
//        System.out.println(myQueue.pop());
//        myQueue.push(5);
//        myQueue.print();

        //环形队列
        CycleQueue cycleQueue = new CycleQueue(3);
        cycleQueue.push(2);
        cycleQueue.push(1);
//        cycleQueue.push(4);
        System.out.println(cycleQueue.isFull());
    }
}
