package factory;

import component.Door;
import component.Room;
import component.Wall;
import game.Maze;

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
