package com.example.customerstable;

public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
