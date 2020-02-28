package com.epam.militarysystem.sort;

import com.epam.militarysystem.Military;

import java.util.Comparator;

public class SortByLastName implements Comparator<Military> {

    @Override
    public int compare(Military o, Military o1) {
        return o.getLastName().compareTo(o1.getLastName());
    }
}
