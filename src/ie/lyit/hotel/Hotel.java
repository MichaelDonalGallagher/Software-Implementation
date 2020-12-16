package ie.lyit.hotel;

import java.util.ArrayList;

public class Hotel {
	ArrayList<Room> rooms;
	ArrayList<Booking> bookings;
	
	public Hotel() {
		rooms = new ArrayList<Room>();
		bookings = new ArrayList<Booking>();
		populateRooms();
	}
	
	public void populateRooms() {
		for(int i=1; i<=10;i++) {
			rooms.add(new Room(2,0,85.00,i));
		}
		for(int i=11; i<=18;i++) {
			rooms.add(new Room(2,2,120.00,i));
		}
	}
	
	public Room findAvailableRoom(int noAdults, int noKids) {
		for(Room room: rooms) {
			if(noAdults<=room.getMaxAdults() && noKids<=room.getMaxKids() && room.getAllocated() == false)
				return room;
		}
		return null;
	}
	
	public ArrayList<Room> getRooms(){
		return rooms;
	}
	
	public ArrayList<Booking> getBookings(){
		return bookings;
	}
	
	public void addBooking(Booking booking) {
		bookings.add(booking);
	}
}
