package it.ariadne.people;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class Rent {
	private String firstName;
	private String	lastName;
	private DateTime datainizio;
	private DateTime datafine;
	
	
	
	public Rent(String firstName, String lastName, DateTime datainizio, DateTime datafine) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.datainizio = datainizio;
		this.datafine = datafine;
	}
	
	public int getDuratagiorni(){
		Period a=new Period(datainizio,datafine);
		return a.getDays();
	}
	
}
