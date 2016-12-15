import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Stream;

/**
 * Created by zhouyi on 16-12-15.
 */
public class Evaluation {

    public static void main(String[] args) {
        List list=new MyArrayList();
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);

        /**
         * Test code for task 1
         */
        list.add(node1);
        list.add(node2);
        list.add(node3);
        boolean task1=true;
        task1 &= 3==list.size();
        task1 &= list.get(0)==node1;
        list.remove(node1);
        task1 &= list.get(0)==node2;
        list.clear();
        task1 &= list.isEmpty();
        if(task1)
            System.out.println("Task 1 completed");
        else
            System.out.println("Task 1 failed");

        /**
         * Test code for task 2
         */
        list.add(node1);
        list.add(node2);
        list.add(node1);
        list.add(node2);
        list.add(node1);
        boolean task2=true;
        task2 &= list.contains(node1);
        task2 &= !list.contains(node3);
        task2 &= 0==list.indexOf(node1);
        task2 &= 4==list.lastIndexOf(node1);
        if(task2)
            System.out.println("Task 2 completed");
        else
            System.out.println("Task 2 failed");

        /**
         * Test code for task 3
         */
        Iterator iterator=list.iterator();
        boolean task3=true;
        int times=0;
        if(iterator!=null) {
            while (iterator.hasNext())
                times++;
            task3 &= times == 5;
            if (times == 5) {
                iterator = list.iterator();
                task3 &= iterator.next() == node1;
                task3 &= iterator.next() == node2;
                task3 &= iterator.next() == node1;
                task3 &= iterator.next() == node2;
                task3 &= iterator.next() == node1;
            }
        }else
            task3=false;
        if(task3)
            System.out.println("Task 3 completed");
        else
            System.out.println("Task 3 failed");
    }
}

class Node{
    int val;

    public Node(int val){
        this.val=val;
    }

    @Override
    public String toString(){
        return "Node<"+val+">";
    }
}
