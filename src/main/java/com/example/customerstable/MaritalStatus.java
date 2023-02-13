package com.example.customerstable;

public enum MaritalStatus {
    SINGLE, MARRIED, WIDOWED, DIVORCED, SEPARATED;
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
