package com.wh.control4.component.enchanted;

import com.wh.control4.component.Door;
import com.wh.control4.component.Room;

public class EnchantedDoor extends Door {
    private Spell spell;

    public EnchantedDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    public void addSpell(Spell spell){
        this.spell = spell;
    }

}
