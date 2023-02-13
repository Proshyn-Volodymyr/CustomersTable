package com.example.customerstable;

public enum EducationDegree {
    JUNIOR_SPECIALIST, BACHELOR, MASTER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
