import game.MazeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the maze game");
        System.out.println("What type of maze would you like to play?");
        System.out.println("1 - regular maze");
        int gameType = -1;
        if(in.hasNextInt()){
            gameType = in.nextInt();
        }

        if(gameType != 1){
            throw new IllegalArgumentException("Not a supported game type");
        }

        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze();
    }
}
