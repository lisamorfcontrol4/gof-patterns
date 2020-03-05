package com.wh.control4;

import com.wh.control4.builder.MazeBuilder;
import com.wh.control4.builder.RoomBuilder;
import com.wh.control4.component.Room;
import com.wh.control4.component.Wall;
import com.wh.control4.factory.FactoryFactory;
import com.wh.control4.game.MazeGame;
import com.wh.control4.util.Direction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the maze com.wh.control4.game");
        System.out.println("What type of maze would you like to play?");
        System.out.println("1 - regular maze");
        System.out.println("2 - Enchanted maze");
        int gameType = -1;
        if(in.hasNextInt()){
            gameType = in.nextInt();
        }

        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(FactoryFactory.createFactory(gameType));

        MazeBuilder builder = new MazeBuilder();
        RoomBuilder roomBuilder = new RoomBuilder(1);
        roomBuilder.setSide(Direction.EAST, new Wall());
        var room2 = roomBuilder.build();
        builder.    addRoom(room2);
        var maze = builder.build();
    }
}
