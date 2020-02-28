package com.epam.militarysystem;

public class Soldier implements Military {

    private int id;
    private String name;
    private String lastName;
    private String rank;


    public Soldier(int id, String name, String lastName, String rank) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rank = rank;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getRank() {
        return rank;
    }

    @Override
    public void getAll() {
        System.out.println("Id = " + id + "| Name = " + name + "| Last Name = " + lastName + "| SortByPosition = " + rank);
    }

}
