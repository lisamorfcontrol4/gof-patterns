package component.enchanted;

public class Spell {
    private boolean isCast;
    private String name;
    private int level;

    public Spell(boolean isCast, String name, int level) {
        this.isCast = isCast;
        this.name = name;
        this.level = level;
    }
}
