package component.bomb;

import component.Room;
import component.Wall;
import game.MazeGame;

public class BombGame extends MazeGame {

    public Room makeRoom(int number){
        return new BombedRoom(number);
    }

    public Wall makeWall(){
        return new BombedWall();
    }
}
