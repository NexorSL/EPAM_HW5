package ua.epam.task4;

import java.util.ArrayList;
import java.util.TreeSet;

public class ConverterToHeightBalancedBST {
    public TreeSet convert(ArrayList arrayList){
        if(arrayList.size() == 0 || arrayList == null) return null;
        TreeSet treeSet = new TreeSet(arrayList);
        return treeSet;
    }
}
