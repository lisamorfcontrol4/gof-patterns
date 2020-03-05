package com.wh.control4.component;

import com.wh.control4.util.Direction;

import java.util.Arrays;
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
        sides[direction.getValue()] = mapSite;
    }

    public MapSite getSide(Direction direction){
        return sides[direction.getValue()];
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
