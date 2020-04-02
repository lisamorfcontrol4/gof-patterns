package component.enchanted;

import component.Door;
import component.Room;
import game.MazeGame;

public class EnchantedGame extends MazeGame {

    public Room makeRoom(int number){
        EnchantedRoom
                enchantedRoom = new EnchantedRoom(number);
        enchantedRoom.addTikiBird();
        return enchantedRoom;
    }

    public Door makeDoor(Room room1, Room room2){
        return new EnchantedDoor(room1, room2);
    }
}
