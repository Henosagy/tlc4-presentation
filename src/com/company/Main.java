package com.company;

public class Main {

    public static void main(String[] args) {
	Patient patient = new Patient("Henry");
    Physician physician = new Physician("Dzifa");
    Dentist dentist = new Dentist("Ebuka");
    Nurse nurse = new Nurse("Edem");

    patient.Attend(physician);
    patient.Attend(dentist);
    patient.Attend(nurse);
    }
}
