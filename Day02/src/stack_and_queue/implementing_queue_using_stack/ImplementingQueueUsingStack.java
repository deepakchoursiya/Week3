package Day02.stack_and_queue.implementing_queue_using_stack;

class ImplementingQueueUsingStack

{
    // Driver code
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);



        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

        q.enQueue(11);
        q.enQueue(21);
        q.enQueue(31);



    }
}