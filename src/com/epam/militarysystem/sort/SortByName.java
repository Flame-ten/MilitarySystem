package com.epam.militarysystem.sort;

import com.epam.militarysystem.Military;

import java.util.Comparator;

public class SortByName implements Comparator<Military> {

    @Override
    public int compare(Military o, Military o1) {
        return o.getName().compareTo(o1.getName());
    }
}

