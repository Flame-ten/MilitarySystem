package com.epam;

import com.epam.militarysystem.Company;
import com.epam.militarysystem.Military;
import com.epam.militarysystem.Soldier;
import com.epam.militarysystem.sort.Rank;
import com.epam.militarysystem.sort.SortById;
import com.epam.militarysystem.sort.SortByLastName;
import com.epam.militarysystem.sort.SortByName;

import java.util.List;


public class Runner {
    public static void main(String[] args) {

        Soldier general = new Soldier(1, "Ramzan", "Kadyrov", Rank.GENERAL);

        Soldier secondMajor = new Soldier(3, "Vladimir", "Putin", Rank.MAJOR);
        Soldier firstMajor = new Soldier(2, "Jack", "Nicholson", Rank.MAJOR);

        Soldier firstCaptain = new Soldier(4, "Jack", "Sparrow", Rank.CAPTAIN);
        Soldier secondCaptain = new Soldier(5, "Adam", "Sandler", Rank.CAPTAIN);

        Soldier firstPrivate = new Soldier(7, "Eric", "Cartman", Rank.PRIVATE_SOLDIER);
        Soldier secondPrivate = new Soldier(8, "Stephan", "Carry", Rank.PRIVATE_SOLDIER);
        Soldier thirdPrivate = new Soldier(6, "Michael", "Jordan", Rank.PRIVATE_SOLDIER);
        Soldier fourthPrivate = new Soldier(9, "Lebron", "James", Rank.PRIVATE_SOLDIER);
        Soldier fifthPrivate = new Soldier(10, "Alex", "Hirsh", Rank.PRIVATE_SOLDIER);
        Soldier sixthPrivate = new Soldier(11, "Jimmy", "Neutrone", Rank.PRIVATE_SOLDIER);

        Company company = new Company();
        Company captainSquad = new Company();
        Company majorSquad = new Company();
        Company privateSquad = new Company();

        privateSquad.addUnit(firstPrivate);
        privateSquad.addUnit(secondPrivate);
        privateSquad.addUnit(thirdPrivate);
        privateSquad.addUnit(fourthPrivate);
        privateSquad.addUnit(fifthPrivate);
        privateSquad.addUnit(sixthPrivate);

        captainSquad.addUnit(firstCaptain);
        captainSquad.addUnit(secondCaptain);
        captainSquad.addUnit(privateSquad);

        majorSquad.addUnit(firstMajor);
        majorSquad.addUnit(secondMajor);

        majorSquad.addUnit(captainSquad);

        company.addUnit(majorSquad);
        company.addUnit(general);

        List<Military> allMilitary = company.getAll();

        System.out.println("Sort by ID");
        allMilitary.sort(new SortById());
        allMilitary.forEach(oneMilitary -> System.out.println(oneMilitary.getId()));

        System.out.println("Sort by Name");
        allMilitary.sort(new SortByName());
        allMilitary.forEach(oneMilitary -> System.out.println(oneMilitary.getName()));

        System.out.println("Sort by Last Name");
        allMilitary.sort(new SortByLastName());
        allMilitary.forEach(oneMilitary -> System.out.println(oneMilitary.getLastName()));

        System.out.println("Sort by Rank");
        allMilitary.sort(new Rank());
        allMilitary.forEach(oneMilitary -> System.out.println(oneMilitary.getRank()));

    }
}

