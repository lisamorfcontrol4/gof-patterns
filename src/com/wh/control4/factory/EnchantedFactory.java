package com.wh.control4.factory;

import com.wh.control4.component.Door;
import com.wh.control4.component.Room;
import com.wh.control4.component.enchanted.EnchantedDoor;
import com.wh.control4.component.enchanted.EnchantedRoom;
import com.wh.control4.component.enchanted.Spell;
import com.wh.control4.component.enchanted.SpellTypes;

public class EnchantedFactory extends MazeFactory {

    public Room createRoom(int roomNumber){
        EnchantedRoom enchantedRoom = new EnchantedRoom(roomNumber);
        enchantedRoom.removeTikiBird();
        return enchantedRoom;
    }

    public Door createDoor(Room room1, Room room2) {
        EnchantedDoor enchantedDoor = new EnchantedDoor(room1, room2);
        Spell spell = new Spell(false, SpellTypes.ALOHOMORA, 2);
        enchantedDoor.addSpell(spell);
        return enchantedDoor;
    }
}
