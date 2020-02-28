package com.epam.militarysystem.sort;

import com.epam.militarysystem.Military;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Rank implements Comparator<Military> {

    public static final String GENERAL = "General";
    public static final String MAJOR = "Major";
    public static final String CAPTAIN = "Captain";
    public static final String PRIVATE_SOLDIER = "Private Soldier";

    private static Map<String, Integer> rankPriority = new HashMap<>();

    static {
        rankPriority.put(GENERAL, 1);
        rankPriority.put(MAJOR, 2);
        rankPriority.put(CAPTAIN, 3);
        rankPriority.put(PRIVATE_SOLDIER, 4);
    }

    @Override
    public int compare(Military o, Military o1) {
        return rankPriority.get(o.getRank()).compareTo(rankPriority.get(o1.getRank()));
    }
}
