package com.company;

public class Physician implements PatientVisitor{
    private String name;

    public Physician(String name) {
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
        return "Physician{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void Visit(Patient patient) {
        System.out.println("Physician " + this.getName() + " performed a checkup on Patient " +patient.getName());
    }
}
