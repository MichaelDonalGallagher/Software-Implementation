package ie.lyit.testers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ie.lyit.hotel.*;

public class RoomTest {
	private Room r1;

	@Before
	public void setUp() throws Exception {
		r1 = new Room(1,0,60.00,1);
	}

	@Test
	public void testRoom() {
		assertEquals("Max adults should be 1", 1, r1.getMaxAdults());
		assertEquals("Max kids should be 0", 0, r1.getMaxKids());
		assertTrue(r1.getPricePerNight()==60.00);
		assertFalse("Allocated should be false", r1.getAllocated());
	}

	@Test
	public void testToString() {
		assertEquals("Should return ROOM 1 [1 adult(s),0 kid(s) @ €60.0 p/n,NOT allocated]", "ROOM 1 [1 adult(s),0 kid(s) @ €60.0 p/n,NOT allocated]", r1.toString());
	}

	@Test
	public void testSetMaxAdults() {
		r1.setMaxAdults(2);
		assertTrue(r1.getMaxAdults()==2);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testSetMaxAdultsForException() {
		r1=new Room(5,0,60.00,1);
	}

	@Test
	public void testSetMaxKids() {
		r1.setMaxKids(2);
		assertTrue(r1.getMaxKids()==2);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testSetMaxKidsForException() {
		r1=new Room(1,5,60.00,1);
	}

	@Test
	public void testSetPricePerNight() {
		r1.setPricePerNight(80.00);
		assertTrue(r1.getPricePerNight()==80.00);
	}

	@Test
	public void testSetAllocated() {
		r1.setAllocated(true);
		assertTrue(r1.getAllocated());
	}

}
