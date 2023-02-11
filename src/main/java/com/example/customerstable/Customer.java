package com.example.customerstable;

import java.util.Calendar;
import java.util.Date;

public class Customer {
    private String name;
    private String lastName;
    private Gender gender;
    private EducationDegree educationDegree;
    private MaritalStatus maritalStatus;
    private String email;
    private String address;
    private String phoneNumber;
    private int postNumber;
    private int id;
    private int age;
    private int amountOfChildren;
    private int idCardNumber;
    private int healthInsuranceNumber;
    private String dateOfRegistration;

private Customer(Builder builder){
    this.name = builder.name;
    this.lastName = builder.lastName;
    this.gender = builder.gender;
    this.educationDegree = builder.educationDegree;
    this.maritalStatus = builder.maritalStatus;
    this.email = builder.email;
    this.address = builder.address;
    this.phoneNumber = builder.phoneNumber;
    this.postNumber = builder.postNumber;
    this.id = builder.id;
    this.age = builder.age;
    this.amountOfChildren = builder.amountOfChildren;
    this.idCardNumber = builder.idCardNumber;
    this.healthInsuranceNumber = builder.healthInsuranceNumber;
    this.dateOfRegistration = builder.dateOfRegistration;
}

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public int getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public static class Builder {
        private String name;
        private String lastName;
        private Gender gender;
        private EducationDegree educationDegree;
        private MaritalStatus maritalStatus;
        private String email;
        private String address;
        private String phoneNumber;
        private int postNumber;
        private int id;
        private int age;
        private int amountOfChildren;
        private int idCardNumber;
        private int healthInsuranceNumber;
        private String dateOfRegistration;

        public Builder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder educationDegree(EducationDegree educationDegree) {
            this.educationDegree = educationDegree;
            return this;
        }

        public Builder martialStatus(MaritalStatus maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder postNumber(int postNumber) {
            this.postNumber = postNumber;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder amountOfChildren(int amountOfChildren) {
            this.amountOfChildren = amountOfChildren;
            return this;
        }
        public Builder idCardNumber(int idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public Builder healthInsuranceNumber(int healthInsuranceNumber) {
            this.healthInsuranceNumber = healthInsuranceNumber;
            return this;
        }
        public Builder dateOfRegistration(String dateOfRegistration) {
            this.dateOfRegistration = dateOfRegistration;
            return this;
        }
        public Customer build() {
            Customer customer = new Customer(this);
            return customer;
        }

    }

}
