package ua.epam.task1Test;

import org.junit.Test;
import ua.epam.task1.RotateElementsList;

import static org.junit.Assert.*;

import java.util.LinkedList;

public class RotateElementsListTest {
    @Test
    public void testRotateElements(){
        RotateElementsList rotateElementsList = new RotateElementsList();
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        LinkedList<Integer> linkedListUpdated = new LinkedList();
        linkedListUpdated.add(4);
        linkedListUpdated.add(5);
        linkedListUpdated.add(1);
        linkedListUpdated.add(2);
        linkedListUpdated.add(3);

        LinkedList<Integer> result = rotateElementsList.rotateElements(linkedList, 2);
        assertEquals(result, linkedListUpdated);
    }
}
