package quizes.q3.saba_gelashvili_2;

public class Person {

    String id;
    String name, surname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void checkIn(Room room) {
        this.room = room;
        room.setOccupied(true);
        System.out.println("Checked into room " + room.getRoomNumber());
    }

    public void checkOut() {
        if (this.room != null) {
            this.room.setOccupied(false);
            System.out.println("Checked out of room " + this.room.getRoomNumber());
            this.room = null;
        } else {
            System.out.println("Not checked into any room");
        }
    }
}
