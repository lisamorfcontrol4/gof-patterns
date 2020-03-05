package com.wh.control4.game_engine;

import com.wh.control4.util.SpellTypes;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGeneration {


    public boolean  flipACoin(){
        return Math.random()*1000 % 2 == 0;
    }

    public SpellTypes randomSpell(){
        var counts = SpellTypes.values().length;
        var random = ThreadLocalRandom.current().nextInt(0,counts+1);
        return SpellTypes.values()[random];

    }
}
