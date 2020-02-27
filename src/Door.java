public class Door extends MapSite {
    private boolean isOpen;
    private Room room1;
    private Room room2;

    public Door(Room room1, Room room2) {
        this.isOpen = false;
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter() {
        if(isOpen){
            System.out.println("you went into the other room.");
        } else {
            System.out.println("The door is closed.  You hurt your nose.");
        }
    }

    public Room otherSideFrom(Room room){
        return room.equals(room1)
                ? room1
                : room2;
    }
}
