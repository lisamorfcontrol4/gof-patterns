package com.wh.control4.game;

import com.wh.control4.component.Room;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    private List<Room> rooms;

    public Maze(){
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public Room getRoom(int number){
        return rooms.get(number);
    }
}
