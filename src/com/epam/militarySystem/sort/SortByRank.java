package com.epam.militarySystem.sort;

import com.epam.militarySystem.Military;

import java.util.Comparator;

public class SortByRank implements Comparator<Military> {
    @Override
    public int compare(Military o1, Military o2) {
        return Rank.rankPriority.get(o1.getRank()).compareTo(Rank.rankPriority.get(o2.getRank()));
    }
}
