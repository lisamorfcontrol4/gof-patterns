package component.enchanted;

import component.Room;

public class EnchantedRoom extends Room {
    private boolean hasTikiBirds;

    public EnchantedRoom(int roomNumber) {
        super(roomNumber);
    }

    public void addTikiBird(){
        this.hasTikiBirds = true;
    }

    public void removeTikiBird(){
        this.hasTikiBirds = false;
    }
}
