package com.company;

public class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String  toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                '}';
    }

    public void Attend(PatientVisitor patientVisitor){
        patientVisitor.Visit(this);
    }
}
