package com.wh.control4.factory;

import com.wh.control4.component.Door;
import com.wh.control4.component.Room;
import com.wh.control4.component.Wall;
import com.wh.control4.game.Maze;

public class MazeFactory {

    public Maze createMaze(){
        return new Maze();
    }

    public Room createRoom(int roomNumber){
        return new Room(roomNumber);
    }

    public Wall createWall(){
        return new Wall();
    }

    public Door createDoor(Room room1, Room room2){
        return new Door(room1, room2);
    }
}
