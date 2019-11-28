package ua.epam.task2;

import java.util.LinkedList;

public class Partition {
    public LinkedList partition(LinkedList<Integer> linkedList, int value) {
        if (linkedList.size() == 0 || linkedList == null) return null;

        LinkedList newList = new LinkedList();

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) < value) {
                newList.add(linkedList.get(i));
                linkedList.remove(i);
            }
        }
        newList.addAll(linkedList);
        return newList;
    }

}
