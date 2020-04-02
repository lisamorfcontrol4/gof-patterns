import component.bomb.BombGame;
import component.enchanted.EnchantedGame;
import game.MazeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the maze game");
        System.out.println("What type of maze would you like to play?");
        System.out.println("1 - regular maze");
        System.out.println("2 - bomb maze");
        System.out.println("3 - enchanted maze");
        int gameType = -1;
        if(in.hasNextInt()){
            gameType = in.nextInt();
        }

        MazeGame mazeGame;
        switch(gameType){
            case 1:
                mazeGame = new MazeGame();
                break;
            case 2:
                mazeGame = new BombGame();
                break;
            case 3:
                mazeGame = new EnchantedGame();
                break;
            default:
                throw new IllegalArgumentException("Not a supported game type");
        }


        mazeGame.createMaze();
    }
}
