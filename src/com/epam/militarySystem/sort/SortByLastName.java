package com.epam.militarySystem.sort;

import com.epam.militarySystem.Military;

import java.util.Comparator;

public class SortByLastName implements Comparator<Military> {

    @Override
    public int compare(Military o, Military o1) {
        return o.getLastName().compareTo(o1.getLastName());
    }
}
