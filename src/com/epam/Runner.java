package com.epam;

import com.epam.militarySystem.Military;
import com.epam.militarySystem.Officer;
import com.epam.militarySystem.Soldier;
import com.epam.militarySystem.sort.*;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Officer general = new Officer(1, "Ramzan", "Kadyrov", Rank.GENERAL);

        Officer secondMajor = new Officer(3, "Vladimir", "Putin", Rank.MAJOR);
        Officer firstMajor = new Officer(2, "Jack", "Nicholson", Rank.MAJOR);

        Officer firstCaptain = new Officer(4, "Jack", "Sparrow", Rank.CAPTAIN);
        Officer secondCaptain = new Officer(5, "Adam", "Sandler", Rank.CAPTAIN);

        Soldier firstPrivate = new Soldier(7, "Eric", "Cartman", Rank.PRIVATE_SOLDIER);
        Soldier secondPrivate = new Soldier(8, "Stephan", "Carry", Rank.PRIVATE_SOLDIER);
        Soldier thirdPrivate = new Soldier(6, "Michael", "Jordan", Rank.PRIVATE_SOLDIER);
        Soldier fourthPrivate = new Soldier(9, "Lebron", "James", Rank.PRIVATE_SOLDIER);
        Soldier fifthPrivate = new Soldier(10, "Alex", "Hearsh", Rank.PRIVATE_SOLDIER);
        Soldier sixthPrivate = new Soldier(11, "Jimmy", "Neutrone", Rank.PRIVATE_SOLDIER);

        firstCaptain.addUnit(firstPrivate);
        firstCaptain.addUnit(secondPrivate);
        firstCaptain.addUnit(thirdPrivate);
        secondCaptain.addUnit(fourthPrivate);
        secondCaptain.addUnit(fifthPrivate);
        secondCaptain.addUnit(sixthPrivate);

        firstMajor.addUnit(firstCaptain);
        secondMajor.addUnit(secondCaptain);

        general.addUnit(firstMajor);
        general.addUnit(secondMajor);

        List<Military> allMilitary = general.getAll();

        System.out.println("Sort by ID");
        allMilitary.sort(new SortById());
        allMilitary.forEach(System.out::println);

        System.out.println("Sort by Name");
        allMilitary.sort(new SortByName());
        allMilitary.forEach(System.out::println);

        System.out.println("Sort by Last Name");
        allMilitary.sort(new SortByLastName());
        allMilitary.forEach(System.out::println);

        System.out.println("Sort by Rank");
        allMilitary.sort(new SortByRank());
        allMilitary.forEach(System.out::println);

    }
}

