package com.epam.militarySystem;

import java.util.List;

public interface Military {
    int getId();

    String getName();

    String getLastName();

    String getRank();

    List<Military> getAll();

}
