package com.epam.militarySystem.sort;

import java.util.HashMap;
import java.util.Map;

public class Rank {

    public static final String GENERAL = "General";
    public static final String MAJOR = "Major";
    public static final String CAPTAIN = "Captain";
    public static final String PRIVATE_SOLDIER = "Private Soldier";

    public static final Map<String, Integer> rankPriority = new HashMap<>();

    static {
        rankPriority.put(GENERAL, 1);
        rankPriority.put(MAJOR, 2);
        rankPriority.put(CAPTAIN, 3);
        rankPriority.put(PRIVATE_SOLDIER, 4);
    }
}
