package com.guyueyue.queue;

/**
 * 队列
 */
public class Queue {
    private int head;
    private int rear;
    private int maxSize;
    private int[] num;

    Queue(int maxSize) {
        this.maxSize = maxSize;
        this.head = -1;//指向第一个元素的上一个位置
        this.rear = -1;//指向最后一个元素的位置
        this.num = new int[maxSize];
    }

    /**
     * 是否为空
     */
    public boolean isEmpty() {
        return this.head == this.rear;
    }

    /**
     * 是否已满
     */
    public boolean isFull(){
        return this.rear == this.maxSize - 1;
    }

    /**
     * 添加数据/入队列
     */
    public void push(int newNum){
        if(this.isFull()){
            throw new RuntimeException("队列已满");
        }

        this.rear++;
        this.num[this.rear] = newNum;
    }

    /**
     * 获取数据/出队列
     */
    public int pop(){
        if(this.isEmpty()){
            throw new RuntimeException("队列为空");
        }

        this.head++;
        return this.num[this.head];
    }

    /**
     * 队首是多少
     */
    public int get(){
        if(this.isEmpty()){
            throw new RuntimeException("队列为空");
        }

        int key = this.head + 1;
        return this.num[key];
    }

    /**
     * 显示队列所有数据
     */
    public void print(){
        if(this.isEmpty()){
            throw new RuntimeException("队列为空");
        }

        for (int i = this.head + 1; i <= this.rear; i++) {
            System.out.print(this.num[i] + " ");
        }
        System.out.println();
    }
}
