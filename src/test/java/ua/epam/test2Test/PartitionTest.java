package ua.epam.test2Test;

import org.junit.Test;
import ua.epam.task2.Partition;

import static org.junit.Assert.*;
import java.util.LinkedList;

public class PartitionTest {
    @Test
    public void testPartition(){
        Partition partition = new Partition();
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(2);

        LinkedList linkedListUpdated = new LinkedList();
        linkedListUpdated.add(1);
        linkedListUpdated.add(2);
        linkedListUpdated.add(2);
        linkedListUpdated.add(4);
        linkedListUpdated.add(3);
        linkedListUpdated.add(5);

        LinkedList result = partition.partition(linkedList, 3);
        assertEquals(result, linkedListUpdated);
    }
}
