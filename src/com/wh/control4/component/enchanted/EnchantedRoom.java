package com.wh.control4.component.enchanted;

import com.wh.control4.component.Room;

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
