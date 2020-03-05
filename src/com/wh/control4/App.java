package com.wh.control4;

import com.wh.control4.factory.FactoryFactory;
import com.wh.control4.game.MazeGame;

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
    }
}
