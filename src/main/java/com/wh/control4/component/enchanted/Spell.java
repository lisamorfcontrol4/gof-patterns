package com.wh.control4.component.enchanted;

import com.wh.control4.util.SpellTypes;

public class Spell {
    private boolean isCast;
    private SpellTypes spellType;
    private int level;

    public Spell(boolean isCast, SpellTypes types, int level) {
        this.isCast = isCast;
        this.spellType = types;
        this.level = level;
    }
}
