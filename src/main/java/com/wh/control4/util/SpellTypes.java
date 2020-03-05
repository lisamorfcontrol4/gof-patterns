package com.wh.control4.util;


public enum SpellTypes {

    RIDDIKULUS ("Riddikulus"),
    OBLIVATE("Obliviate"),
    SECTUMSEMPRA("Sectumsempra"),
    AVADA_KEDAVRA("Avada Kedavra"),
    ALOHOMORA("Alohomora"),
    LUMOS("Lumos"),
    EXPELLIARMUS("Expelliarmus"),
    WINGARDIUM_LEVIOSA("Wingardium Leviosa"),
    EXPECTO_PATRONUM(" Expecto Patronum");





    private SpellTypes(String displayName){

        this.displayName = displayName;
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
