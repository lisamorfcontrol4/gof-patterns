package com.wh.control4.game_engine;

import com.wh.control4.util.SpellTypes;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGeneration {


    public boolean  flipACoin(){
        return randomNumber(0,1000) % 2 == 0;
    }

    public SpellTypes randomSpell(){
        var counts = SpellTypes.values().length;
        var random = randomNumber(0, counts);
        return SpellTypes.values()[random];

    }



    public int randomNumber(int min,  int max){
        return ThreadLocalRandom.current().nextInt(0,max+1);
    }
}
