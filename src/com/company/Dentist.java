package com.company;

public class Dentist implements PatientVisitor{
    private String name;

    public Dentist(String name) {
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
        return "Dentist{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void Visit(Patient patient) {
        System.out.println("Dentist " + this.getName() + " performed a checkup on Patient " +patient.getName());
    }
}
