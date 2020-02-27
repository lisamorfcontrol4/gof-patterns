package util;

public enum Direction {
    NORTH(0),
    SOUTH(1),
    EAST(2),
    WEST(3);

    private int value;
    Direction(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
