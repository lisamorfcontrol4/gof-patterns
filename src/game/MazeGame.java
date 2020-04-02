package game;

import component.Door;
import component.Room;
import component.Wall;

import static util.Direction.*;

public class MazeGame {

    public Maze createMaze(){
        Maze maze = makeMaze();
        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door theDoor = makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(NORTH, makeWall());
        room1.setSide(EAST, theDoor);
        room1.setSide(SOUTH, makeWall());
        room1.setSide(WEST, makeWall());

        room2.setSide(NORTH, makeWall());
        room2.setSide(EAST, makeWall());
        room2.setSide(SOUTH, makeWall());
        room2.setSide(WEST, theDoor);

        return maze;
    }

    public Maze makeMaze(){
        return new Maze();
    }

    public Room makeRoom(int number){
        return new Room(number);
    }

    public Door makeDoor(Room room1, Room room2){
        return new Door(room1, room2);
    }

    public Wall makeWall(){
        return new Wall();
    }
}
