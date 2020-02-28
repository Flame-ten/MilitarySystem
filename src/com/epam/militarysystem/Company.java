package com.epam.militarysystem;

import java.util.ArrayList;
import java.util.List;

public class Company implements Military {

    private final List<Military> childSoldier = new ArrayList<>();

    public void addUnit(Military component) {
        childSoldier.add(component);
    }

    @Override
    public int getId() {
        return 0;
    }

    public List<Military> getList() {
        return childSoldier;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getRank() {
        return null;
    }

    @Override
    public void getAll() {
        for (Military component : childSoldier) {
            component.getAll();
        }
    }
}

