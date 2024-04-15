package quizes.q3.saba_gelashvili_2;

import java.util.Map;
import java.util.HashMap;

public class Hotel {
    private Map<String, Room> guests;

    public Hotel() {
        this.guests = new HashMap<>();
    }

    public void checkIn(String personId, Room room) {
        this.guests.put(personId, room);
        room.setOccupied(true);
        System.out.println("Guest with ID " + personId + " checked into room " + room.getRoomNumber());
    }

    public void checkOut(String personId) {
        Room room = this.guests.get(personId);
        if (room != null) {
            room.setOccupied(false);
            System.out.println("Guest with ID " + personId + " checked out of room " + room.getRoomNumber());
            this.guests.remove(personId);
        } else {
            System.out.println("No guest with ID " + personId + " is checked into a room");
        }
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : this.guests.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            System.out.println("Guest with ID " + personId + " is checked into room " + room.getRoomNumber());
        }
    }
}

}
