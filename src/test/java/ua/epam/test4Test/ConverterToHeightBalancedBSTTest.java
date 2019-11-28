package ua.epam.test4Test;
import org.junit.Test;
import ua.epam.task4.ConverterToHeightBalancedBST;

import java.util.ArrayList;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class ConverterToHeightBalancedBSTTest {
    @Test
    public void testConvert(){
        ConverterToHeightBalancedBST converter = new ConverterToHeightBalancedBST();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);

        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);

        TreeSet result = converter.convert(arrayList);
        assertEquals(result, treeSet);
    }
}
