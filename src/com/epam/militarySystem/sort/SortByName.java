package com.epam.militarySystem.sort;

import com.epam.militarySystem.Military;

import java.util.Comparator;

public class SortByName implements Comparator<Military> {

    @Override
    public int compare(Military o, Military o1) {
        return o.getName().compareTo(o1.getName());
    }
}

