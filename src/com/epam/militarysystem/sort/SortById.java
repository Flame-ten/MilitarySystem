package com.epam.militarysystem.sort;

import com.epam.militarysystem.Military;

import java.util.Comparator;

public class SortById implements Comparator<Military> {

    @Override
    public int compare(Military o, Military o1) {
        return Integer.compare(o.getId(), o1.getId());
    }
}
