package factory;

public class FactoryFactory {

    public static final int supportedTypes = 2;

    public static MazeFactory createFactory(int number){
        if(number > FactoryFactory.supportedTypes){
            throw new IllegalArgumentException("Not a supported game type");
        }

        return number == 1
                ? new MazeFactory()
                : new EnchantedFactory();
    }
}
