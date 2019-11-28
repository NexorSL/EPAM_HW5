package ua.epam.test3Test;

import org.junit.Test;
import ua.epam.task3.RemoveDuplicates;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        int length = 3;
        int result = removeDuplicates.removeDuplicates(arrayList);
        assertEquals(result, length);
    }
}
