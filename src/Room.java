import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Room extends MapSite {
    private int roomNumber;
    MapSite[] sides;

    public Room(int roomNumber){
        this.roomNumber = roomNumber;
        sides = new MapSite[4];
    }

    @Override
    public void enter() {
        System.out.println("Entered room " + roomNumber);
    }

    public void setSide(Direction direction, MapSite mapSite){
        int position = 0;
        switch(direction){
            case NORTH:
                position = 0;
                break;
            case EAST:
                position = 1;
                break;
            case SOUTH:
                position = 2;
                break;
            case WEST:
                position = 3;
                break;
        }
        sides[position] = mapSite;
    }

    public MapSite getSide(Direction direction){
        switch(direction){
            case NORTH:
                return sides[0];
            case EAST:
                return sides[1];
            case SOUTH:
                return sides[2];
            case WEST:
                return sides[3];
        }
        throw new IllegalArgumentException("can't get here");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber &&
                Arrays.equals(sides, room.sides);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(roomNumber);
        result = 31 * result + Arrays.hashCode(sides);
        return result;
    }
}
