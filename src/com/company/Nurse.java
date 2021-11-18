package com.company;

public class Nurse implements PatientVisitor{
    private String name;

    public Nurse(String name) {
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
        return "Nurse{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void Visit(Patient patient) {
        System.out.println("Nurse " + this.getName() + " took readings from Patient " +patient.getName());
    }
}
