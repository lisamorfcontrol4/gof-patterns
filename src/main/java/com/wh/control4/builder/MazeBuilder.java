package com.wh.control4.builder;

import com.wh.control4.component.Door;
import com.wh.control4.component.Room;
import com.wh.control4.game.Maze;

public class MazeBuilder {

    private Maze maze;

    public MazeBuilder(){
        maze = new Maze();
    }





    public MazeBuilder addRoom(Room room){
        maze.addRoom(room);
        return this;
    }



    public Maze build(){
        return maze;
    }
}
