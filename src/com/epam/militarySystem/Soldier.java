package com.epam.militarySystem;

import java.util.ArrayList;
import java.util.List;

public class Soldier implements Military {

    private int id;
    private String name;
    private String lastName;
    private String rank;

    @Override
    public String toString() {
        return "Soldier(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank='" + rank + '\'' +
                ')';
    }

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
    public List<Military> getAll() {
        return new ArrayList<>();
    }

}
