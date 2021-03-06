package ru.perm.v.actuatordemo.dtos;

import javax.validation.constraints.NotNull;

public class SimpleEntity {
    private String name;

    public SimpleEntity() {
    }

    public SimpleEntity(@NotNull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
