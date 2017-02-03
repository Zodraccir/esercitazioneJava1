package it.ariadne.services;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;

import it.ariadne.object.Vehicle;
import it.ariadne.people.Rent;

public class VehicleRental<T extends Vehicle> {
	
	
	private Map<T,Rent> poolVehicle=new HashMap<T,Rent>();
	
	public Set<T> check() {
			return poolVehicle.keySet();
	}
	
	public boolean check(T t){
		if(poolVehicle.get(t)==null)
			return true;
		else if (poolVehicle.get(t)!=null)
			return true;
		return false;
		
	}


	public boolean returnVehicle(T t) {
		if(!(poolVehicle.containsKey(t))){
			System.out.println("nonc'�");
			return false; //Perch� non posso rentare 
		}
		
		if(poolVehicle.get(t)==null){
			System.out.println("� rented");
			return false; //E' gi� non rentanto
		}
		
		poolVehicle.put(t, null);
		return true;
	}

	public void add(T t) {
		poolVehicle.put(t, null);		
	}

	public Rent rent(T t,String first_name,String last_name, DateTime datainizio,DateTime datafine) {
		
		
		if(!(poolVehicle.containsKey(t))){
			System.out.println("nonc'�");
			return null; //Perch� rent non deve creare veicoli
		}
		
		if(poolVehicle.get(t)!=null){
			System.out.println("� rented");
			return null; //E' gi� rentato
		}
		
		poolVehicle.put(t, new Rent( first_name ,last_name , datainizio ,datafine));
		return poolVehicle.get(t);
	}

	

}

