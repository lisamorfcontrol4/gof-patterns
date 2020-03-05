package com.wh.control4.builder;

import com.wh.control4.component.MapSite;
import com.wh.control4.component.Room;
import com.wh.control4.component.Wall;
import com.wh.control4.util.Direction;

import java.util.HashSet;
import java.util.Set;

public class RoomBuilder {

    private Room room;
    private Set<Direction> directionsThatHaveBeenUsed;

    public RoomBuilder(int roomId) {
        this.room = new Room(roomId);
        directionsThatHaveBeenUsed = new HashSet<>();
    }

    public RoomBuilder setSide(Direction direction, MapSite site){
        if(!directionsThatHaveBeenUsed.contains(direction)) {
            room.setSide(direction, site);
        }
        return this;
    }



    public Room build(){
       var numberOfDirections = Direction.values().length;
       if(directionsThatHaveBeenUsed.size() != numberOfDirections){
           throw new IllegalStateException("Not all sides are built");
       }
        return  room;
    }
}
