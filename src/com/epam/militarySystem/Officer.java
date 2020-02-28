package com.epam.militarySystem;

import java.util.ArrayList;
import java.util.List;

public class Officer implements Military {
    private int id;
    private String name;
    private String lastName;
    private String rank;

    @Override
    public String toString() {
        return "Officer(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank='" + rank + '\'' +
                ')';
    }

    public Officer(int id, String name, String lastName, String rank) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rank = rank;
    }

    private final List<Military> childSoldier = new ArrayList<>();

    public void addUnit(Military component) {
        childSoldier.add(component);
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
        List<Military> buffer = new ArrayList<>();
        for (Military military : childSoldier) {
            buffer.addAll(military.getAll());
            buffer.add(military);
        }
        return buffer;

    }
}

