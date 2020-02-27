package game;

import component.Door;
import component.Room;
import component.Wall;

import static util.Direction.*;

public class MazeGame {

    public Maze createMaze(){
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door theDoor = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(NORTH, new Wall());
        room1.setSide(EAST, theDoor);
        room1.setSide(SOUTH, new Wall());
        room1.setSide(WEST, new Wall());

        room2.setSide(NORTH, new Wall());
        room2.setSide(EAST, new Wall());
        room2.setSide(SOUTH, new Wall());
        room2.setSide(WEST, theDoor);

        return maze;
    }
}
