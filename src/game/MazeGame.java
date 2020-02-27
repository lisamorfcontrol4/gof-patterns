package game;

import component.Door;
import component.Room;
import factory.MazeFactory;

import static util.Direction.*;

public class MazeGame {

    public Maze createMaze(MazeFactory factory){
        Maze maze = factory.createMaze();
        Room room1 = factory.createRoom(1);
        Room room2 = factory.createRoom(2);
        Door theDoor = factory.createDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(NORTH, factory.createWall());
        room1.setSide(EAST, theDoor);
        room1.setSide(SOUTH, factory.createWall());
        room1.setSide(WEST, factory.createWall());

        room2.setSide(NORTH, factory.createWall());
        room2.setSide(EAST, factory.createWall());
        room2.setSide(SOUTH, factory.createWall());
        room2.setSide(WEST, theDoor);

        return maze;
    }
}
