package ua.epam.task1;

import java.util.Collections;
import java.util.LinkedList;

public class RotateElementsList {
    public LinkedList rotateElements(LinkedList<Integer> linkedList, int val) {
        if (linkedList.size() == 0 || linkedList == null ||val <= 0) return null;
        Collections.rotate(linkedList, val);
        return linkedList;
    }
}
