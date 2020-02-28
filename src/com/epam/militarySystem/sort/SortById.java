package com.epam.militarySystem.sort;

import com.epam.militarySystem.Military;

import java.util.Comparator;

public class SortById implements Comparator<Military> {

    @Override
    public int compare(Military o, Military o1) {
        return Integer.compare(o.getId(), o1.getId());
    }
}
