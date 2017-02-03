package it.ariadne.test.vehicle;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.object.Car;
import it.ariadne.object.Motorbike;
import it.ariadne.object.Track;
import it.ariadne.object.Vehicle;
import it.ariadne.people.Rent;
import it.ariadne.services.VehicleRental;

public class TestVehicle {
	private VehicleRental<Car> hertz;
	@Before
	public void setup(){
		
		hertz=new VehicleRental();
		hertz.add(new Car("AAAAAA"));
		hertz.add(new Car("BBBBBB"));
		hertz.add(new Car("CCCCCC"));
		hertz.add(new Car("DDDDDD"));
		
		
	
	}
	
	@Test
	public void testAdd(){
		hertz.add(new Car("FFFFFF"));
		Assert.assertEquals("Vehicle added", 5,hertz.check().size());

	}
	
	@Test
	public void testRent(){		
		Car a=new Car("AAAAAA");	
		DateTime inizio=new DateTime().withDayOfMonth(02).withMonthOfYear(02).withYear(2017);
		DateTime fine=new DateTime().withDayOfMonth(05).withMonthOfYear(02).withYear(2017);

		
		Rent returned=hertz.rent(a,"Ciccio","Benzina",inizio,fine);
		Assert.assertEquals("Vehicle rented for 3 days", 3,returned.getDuratagiorni());
	}
	
	@Test
	public void testReturn(){
		Car b=new Car("AAAAAA");
		
		boolean bool=hertz.returnVehicle(b);
		Assert.assertEquals("Vehicle returned", bool,true);

	}
	
	

}
