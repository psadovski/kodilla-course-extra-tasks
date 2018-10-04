package com.kodilla.extratasks;

import java.util.ArrayList;
import java.util.List;

public class ListReversor {
    List<Integer> newList = new ArrayList<>();

    public List<Integer> reverseList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0 ; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
}
