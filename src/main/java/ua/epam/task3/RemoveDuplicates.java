package ua.epam.task3;

import java.util.ArrayList;

public class RemoveDuplicates {
    public int removeDuplicates(ArrayList<Integer> arrayList){
        if(arrayList.size() == 0 || arrayList == null) return 0;

        int elementsRemoved = 0;

        for (int i = 0; i < arrayList.size() - elementsRemoved; i++) {
            if(arrayList.get(i).equals(arrayList.get(i+1))) {
                arrayList.remove(i);
                elementsRemoved++;
            }
        }
        return arrayList.size();
    }
}
