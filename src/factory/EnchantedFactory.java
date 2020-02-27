package factory;

import component.Door;
import component.Room;
import component.enchanted.EnchantedDoor;
import component.enchanted.EnchantedRoom;
import component.enchanted.Spell;

public class EnchantedFactory extends MazeFactory {

    public Room createRoom(int roomNumber){
        EnchantedRoom enchantedRoom = new EnchantedRoom(roomNumber);
        enchantedRoom.removeTikiBird();
        return enchantedRoom;
    }

    public Door createDoor(Room room1, Room room2) {
        EnchantedDoor enchantedDoor = new EnchantedDoor(room1, room2);
        Spell spell = new Spell(false, "Alohomora", 2);
        enchantedDoor.addSpell(spell);
        return enchantedDoor;
    }
}
