package component.enchanted;

import component.Door;
import component.Room;

public class EnchantedDoor extends Door {
    private Spell spell;

    public EnchantedDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    public void addSpell(Spell spell){
        this.spell = spell;
    }

}