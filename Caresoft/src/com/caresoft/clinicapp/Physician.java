package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

class Physician extends User implements HIPAACompliantUser{
	
//... imports class definition...
    

	// Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
    
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters

	
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		int papoo = pin;
		String valOfPin = String.valueOf(papoo);
		if(valOfPin.length() == 4) {
			setPin(papoo);
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(id == confirmedAuthID) {
			return true;
		} 
		return false;
	}
}


