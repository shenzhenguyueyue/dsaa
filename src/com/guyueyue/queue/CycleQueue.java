package com.guyueyue.queue;

/**
 * 环形队列
 */
public class CycleQueue {
    private int   head;//指向第一个元素的位置
    private int   rear;//指向最后一个元素的下一个位置
    private int   maxSize;
    private int[] num;

    public CycleQueue(int maxSize) {
        this.maxSize = maxSize;
        num          = new int[maxSize];
        head         = 0;
        rear         = 0;
    }

    public boolean isEmpty() {
        return head == rear;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == head;
    }

    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("队列已满");
        }

        this.num[this.rear] = value;
                              this.rear = (rear + 1) % maxSize;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }

        int value = this.num[this.head];
        this.head = (head + 1) % maxSize;

        return value;
    }

    // rear >= head   i <= rear
    //rear < head   i < maxSize + rear
    public void show() {
        //简陋实现
        if (rear >= head) {
            for (int i = head; i <= rear; i++) {
                System.out.print(num[i] + " ");
            }
        } else {
            for (int i = head; i < maxSize; i++) {
                System.out.println(num[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(num[i] + " ");
            }
        }

        System.out.println();
    }
}
