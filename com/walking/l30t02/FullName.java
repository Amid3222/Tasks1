package com.walking.l30t02;

public class FullName {
    private String name;
    private String familia;
    private String secondName;

    public FullName(String[] group) {
        this.name = group[1];
        this.familia = group[0];
        this.secondName = group[2];
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + name + '\'' +
                ", familia='" + familia + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
